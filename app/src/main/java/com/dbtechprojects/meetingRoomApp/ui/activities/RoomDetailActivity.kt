package com.dbtechprojects.meetingRoomApp.ui.activities

import android.content.Context
import android.os.Build
import android.os.Bundle
import android.text.Html
import android.text.Layout
import android.util.Log
import android.view.Gravity
import android.view.View
import android.view.ViewGroup.*
import android.widget.*
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.Observer
import com.bumptech.glide.Glide
import com.dbtechprojects.meetingRoomApp.R
import com.dbtechprojects.meetingRoomApp.data.Resource
import com.dbtechprojects.meetingRoomApp.models.RoomItem
import com.dbtechprojects.meetingRoomApp.ui.fragments.showerror
import com.dbtechprojects.meetingRoomApp.ui.viewmodels.RoomDetailViewModel
import com.dbtechprojects.meetingRoomApp.util.ImageUtils
import dagger.hilt.android.AndroidEntryPoint


// Activity to show room details

@AndroidEntryPoint
class RoomDetailActivity : AppCompatActivity() {

    // Declaring Variables

    private val viewModel: RoomDetailViewModel by viewModels()
    private val TAG = "RoomListFragment"
    private var equipmentListSize: Int? = null

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_details)

        setupActionBar("Room Details")

        //declare layout items

        val heroImage       = findViewById<ImageView>(R.id.room_image)
        val capacityText    = findViewById<TextView>(R.id.room_capacity)
        val titleText       = findViewById<TextView>(R.id.room_title)
        val rl              = findViewById<RelativeLayout>(R.id.room_detail_rl)
        val facilitiesimgll = findViewById<LinearLayout>(R.id.room_facilities_image_ll)
        val locationText    = findViewById<TextView>(R.id.room_location)
        val servicesText    = findViewById<TextView>(R.id.room_services_tv)
        val featuresText    = findViewById<TextView>(R.id.room_features_tv)
        val progressBar     = findViewById<ProgressBar>(R.id.room_detail_progressBar)
        val facilitiestext  = findViewById<TextView>(R.id.room_facilities_tv)


        //img loader for glide
        val imgLoader = ImageUtils

        // check for room item passed from list view
        val room: RoomItem? = intent.getParcelableExtra("room")


        room?.key?.let { key ->
            Log.d(TAG, room.key.toString())

            // request room details with room key
            viewModel.getRoomDetails(key)

            //observe results
            viewModel.roomdetails.observe(this, Observer { details ->

                when(details){
                    is Resource.Loading -> {
                        progressBar.visibility = View.VISIBLE
                    }

                    is Resource.Success -> {
                        progressBar.visibility = View.GONE

                        Log.d(TAG, details.data.toString())
                        details.data?.heroImageUrl?.let { imageurl ->
                            imgLoader.loadImage(this, heroImage, imageurl)
                        }
                        details.data?.capacity?.let { capacity ->
                            capacityText.setText("Capacity: $capacity")
                        }
                        details.data?.name?.let { name ->
                            titleText.setText("Name: $name")
                        }

                        // setup Location list
                        details.data?.location?.let {location ->
                            var locationTextString = ""
                            location.floor.floorname.let { floorname ->
                                if (floorname != null){
                                    locationTextString += "Floor Name: $floorname,"
                                }
                            }

                            location.building.buildingname.let { buildingname ->
                                if (buildingname != null){
                                    locationTextString += " <Br>Building name: $buildingname,"
                                }
                            }

                            location.site.sitename.let { sitename ->
                                if (sitename != null){
                                    locationTextString += " <Br>Site name: $sitename,"
                                }
                            }
                            location.region.regionname.let { regionname ->
                                if (regionname != null){
                                    locationTextString += " <Br>Region: $regionname,"
                                }
                            }
                            locationText.setText(Html.fromHtml(locationTextString))
                        }

                        // setup services list
                        details.data?.services?.let { serviceslist ->
                            if (serviceslist.isNotEmpty()){
                                var servicesTextString = ""
                                for (service in serviceslist){
                                    servicesTextString += " ${service.name},"
                                }
                                servicesText.setText("Services:$servicesTextString")
                            }

                        }

                        // setup features list
                        details.data?.features?.let { featurelist ->
                            if (featurelist.isNotEmpty()){
                                var featureTextString = ""
                                for (feature in featurelist){
                                    featureTextString += " ${feature.name},"
                                }
                                featuresText.setText("Features:$featureTextString")
                            }
                        }

                        // setup Equipment List
                        details.data?.equipment.let { equipmentlist ->
                            if (equipmentlist != null) {
                                if (equipmentlist.isNotEmpty()) {
                                    val equipmenttext = TextView(this)
                                    equipmenttext.setText("Equipment")
                                    equipmenttext.textSize = 16F
                                    equipmenttext.setPadding(6,12,6,6)
                                    equipmenttext.id = equipmentlist.size + 1

                                    val relativeLayoutParams =  RelativeLayout.LayoutParams(
                                            RelativeLayout.LayoutParams.WRAP_CONTENT,
                                            RelativeLayout.LayoutParams.WRAP_CONTENT)
                                    relativeLayoutParams.addRule(RelativeLayout.BELOW, R.id.room_facilities_image_ll)
                                    rl.addView(equipmenttext, relativeLayoutParams)

                                    equipmentListSize = equipmentlist.size

                                    for (i in 0 until equipmentlist.size) {
                                        val imgView = ImageView(this)
                                        val txtView = TextView(this)
                                        txtView.setText(equipmentlist[i].name)
                                        txtView.setPadding(6,20,6,6)
                                        txtView.textSize = 8F
                                        txtView.textAlignment = TEXT_ALIGNMENT_CENTER
                                        imgView.id = i + 1 // cannot have an id of 0
                                        imgView.setPadding(6,6,6,6)


                                        val txtlp = RelativeLayout.LayoutParams(180, 150)
                                        txtlp.addRule(RelativeLayout.BELOW, imgView.id)
                                        Log.d(TAG, "Equipimgid : ${imgView.id}")

                                        val lp = RelativeLayout.LayoutParams(150, 150)
                                        lp.addRule(RelativeLayout.BELOW , equipmenttext.id)

                                        if (i != 0 ){
                                            lp.addRule(RelativeLayout.RIGHT_OF, imgView.id -1)
                                            txtlp.addRule(RelativeLayout.RIGHT_OF, imgView.id -1)
                                        }

                                        imgView.layoutParams = lp
                                        imgLoader.loadImage(this, imgView, equipmentlist[i].iconUrl)

                                        rl.addView(imgView)
                                        rl.addView(txtView, txtlp)
                                    }
                                }
                            }

                        }
                        // setup facilities list
                        details.data?.facilities?.let { facilitieslist ->
                            if(facilitieslist.isNotEmpty()) {
                                facilitiestext.setText("Facilities")
                                facilitiestext.textSize = 16F
                                facilitiestext.id = facilitieslist.size + (equipmentListSize ?: 0) + 2
                                Log.d(TAG, "settingup facility items : ${facilitieslist}")
                                Log.d(TAG, "settingup facility items : ${facilitieslist.size}")

                                for (i in 0 until facilitieslist.size) {
                                    val imgView = ImageView(this)

                                    imgView.id = (equipmentListSize ?: 0) + i  + 2 // cannot have an id of 0
                                    Log.d(TAG, "imgid : ${imgView.id}")
                                    Log.d(TAG, "equipmentlistsize : ${equipmentListSize}")
                                    Log.d(TAG, "tvID : ${facilitiestext.id}")

                                    imgView.setPadding(6, 6, 6, 6)

                                    val lp = RelativeLayout.LayoutParams(150, 150)



                                    if (i != 0) {
                                        lp.addRule(RelativeLayout.RIGHT_OF, imgView.id - 1)
                                    }

                                    imgView.layoutParams = lp
                                    imgLoader.loadImage(this, imgView, facilitieslist[i].iconUrl)

                                    facilitiesimgll.addView(imgView)
                                }
                            }

                        }

                    }

                    is Resource.Error -> {
                       progressBar.visibility = View.GONE
                       Toast.makeText(this, "error retrieving room details", Toast.LENGTH_SHORT).show()
                    }
                    else -> {
                        progressBar.visibility = View.GONE
                        Toast.makeText(this, "error retrieving room details", Toast.LENGTH_SHORT).show()
                    }
                }

            })
        }
    }

   private fun setupActionBar(Title: String) {
        val toolbar = findViewById<Toolbar>(R.id.toolbar)

        setSupportActionBar(toolbar)

        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24_white)
            actionBar.title = Title
        }

        toolbar.setNavigationOnClickListener { onBackPressed() }

    }

    override fun onBackPressed() {
        super.onBackPressed()

        finish()

    }

}