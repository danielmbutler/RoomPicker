package com.dbtechprojects.meetingRoomApp.ui.fragments

import android.content.Context
import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.dbtechprojects.meetingRoomApp.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BaseFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
abstract class BaseFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }


}

fun showToastFragment(context: Context, view: View){
    val toast = Toast(context)
    toast.duration = Toast.LENGTH_SHORT
    toast.setGravity(Gravity.BOTTOM, 0, 0)
    toast.view = view
    toast.show()
}

fun showerror(error: String, view: View, context: Context, layoutInflater: LayoutInflater){

    val viewlayout = view.findViewById<ViewGroup>(R.id.constraintlayout)

    val customLayout = layoutInflater.inflate(R.layout.custom_toast, viewlayout)
    customLayout.findViewById<TextView>(R.id.toasttext).setText(error)
    showToastFragment(context,customLayout)

}
