package com.dbtechprojects.meetingRoomApp.ui.adapters

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.dbtechprojects.meetingRoomApp.R
import com.dbtechprojects.meetingRoomApp.models.RoomItem
import com.dbtechprojects.meetingRoomApp.util.ImageUtils


class RoomListAdapter(
    )
    : RecyclerView.Adapter<RoomItemViewHolder>() {

    private var onClickListener: OnClickListener? = null
    private var roomlist = listOf<RoomItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoomItemViewHolder{
        val inflater = LayoutInflater.from(parent.context)
        return RoomItemViewHolder(inflater, parent)
    }

    // set up recycler view item view

    override fun onBindViewHolder(holder: RoomItemViewHolder, position: Int) {

        val itemView = holder.itemView
        itemView.animation = AnimationUtils.loadAnimation(itemView.context, R.anim.slidein_and_fade)
        val TitleText = itemView.findViewById<TextView>(R.id.room_card_title)
        val CapacityText = itemView.findViewById<TextView>(R.id.room_card_capacity)
        val RowImage = itemView.findViewById<ImageView>(R.id.room_card_image)

        val roomItem: RoomItem = roomlist[position]
        holder.bind(roomItem)
        Log.d("ViewHolder", roomItem.toString())

        TitleText?.text = roomItem.name
        CapacityText?.text = "Capacity: ${roomItem.capacity}"

        itemView.setOnClickListener {
            if (onClickListener != null) {
                onClickListener!!.onClick(position, roomItem, holder.itemView)
            }
        }




        //glide image
        val context = RowImage.context

        ImageUtils.loadImage(context, RowImage, roomItem.thumbnailUrl!!)
    }

    override fun getItemCount(): Int = roomlist.size

    fun setOnClickListener(onClickListener: OnClickListener) {
        this.onClickListener = onClickListener
    }

    interface OnClickListener {
        fun onClick(position: Int, model: RoomItem, view: View)
    }

    fun setlist(list:List<RoomItem>){
        roomlist = list
    }
}


class RoomItemViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.layout_room_list_item, parent, false)) {

    fun bind(roomItem: RoomItem) {}

}