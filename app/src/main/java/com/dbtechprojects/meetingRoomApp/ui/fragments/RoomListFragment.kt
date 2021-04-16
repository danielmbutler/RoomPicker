

package com.dbtechprojects.meetingRoomApp.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.dbtechprojects.meetingRoomApp.R
import com.dbtechprojects.meetingRoomApp.data.Resource
import com.dbtechprojects.meetingRoomApp.databinding.FragmentRoomListBinding
import com.dbtechprojects.meetingRoomApp.models.RoomItem
import com.dbtechprojects.meetingRoomApp.ui.activities.RoomDetailActivity
import com.dbtechprojects.meetingRoomApp.ui.adapters.RoomListAdapter
import com.dbtechprojects.meetingRoomApp.ui.viewmodels.RoomListViewModel

import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class RoomListFragment : BaseFragment() {

    // declaring variables

    private val viewModel: RoomListViewModel by viewModels()
    private lateinit var binding: FragmentRoomListBinding
    private lateinit var roomListAdapter: RoomListAdapter
    private val TAG = "RoomListFragment"



    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {

        binding = FragmentRoomListBinding.inflate(inflater, container, false)
        val view = binding.root



        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //setup settings listener

        binding.settingsImgVw.setOnClickListener {
            settingsPopUp()
        }

        // Setup Recycler View
        setupRv()




        // Get List of Rooms
        viewModel.getRooms()

        //Observer Result from List of rooms
        viewModel.roomlist.observe(viewLifecycleOwner, Observer { rooms ->

            when(rooms){

                is Resource.Loading -> {
                    binding.progressBar.visibility = View.VISIBLE
                }
                is Resource.Error -> {
                    showerror("Error Retrieving Rooms", requireView(), requireContext(), layoutInflater)
                    binding.progressBar.visibility = View.GONE
                }
                is Resource.Success -> {
                    // update list
                    binding.progressBar.visibility = View.GONE
                    rooms.data?.let { roomlist ->

                        // Sort Alphabetically
                        roomlist.sortedWith(compareBy(String.CASE_INSENSITIVE_ORDER, { it.name!! }))
                        roomListAdapter.setlist(roomlist)
                    }
                    roomListAdapter.notifyDataSetChanged()
                }
                else -> {
                    showerror("Error Retrieving Rooms", requireView(), requireContext(), layoutInflater)
                    binding.progressBar.visibility = View.GONE
                }
            }

        })
    }


    // show cache deletion window
    private fun settingsPopUp() {

            val builder = AlertDialog.Builder(requireContext())
            builder.setTitle("Remove Cache ?")
            builder.setMessage("Are you sure ?")
                .setCancelable(false)
                .setPositiveButton("Yes") { dialog, id ->
                    viewModel.deleteCachedData()
                    showerror("Cache Removed", requireView(), requireContext(), layoutInflater)

                }

                .setNegativeButton("No") { dialog, id ->
                    // Dismiss the dialog
                    dialog.dismiss()
                }
            val alert = builder.create()
            alert.show()
    }


    // setup recyclerview
    private fun setupRv(){
        val rv = binding.roomList
        roomListAdapter = RoomListAdapter()
        roomListAdapter.setOnClickListener(object : RoomListAdapter.OnClickListener{

            override fun onClick(position: Int, model: RoomItem, view: View) {
                Log.d(TAG, "${model.name} clicked")
                val intent = Intent(activity, RoomDetailActivity::class.java)
                intent.putExtra("room", model)
                startActivity(intent)

            }


        })

        rv.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = roomListAdapter
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d("RoomListFragment" ,"onresume called")
    }


}


