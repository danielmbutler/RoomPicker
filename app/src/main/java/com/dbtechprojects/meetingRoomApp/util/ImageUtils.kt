package com.dbtechprojects.meetingRoomApp.util

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.Target
import com.dbtechprojects.meetingRoomApp.R

//code for handling the loading of images

object ImageUtils {

    fun loadImage(context: Context, ImageView: ImageView, url: String){
        Glide.with(context)
                .load(url)
                .override(Target.SIZE_ORIGINAL, Target.SIZE_ORIGINAL)
                .placeholder(R.drawable.room_item_placeholder)
                .error(R.drawable.room_item_placeholder)
                .into(ImageView);
    }


}