package com.example.aion.Fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.aion.R

/**
 * A simple [Fragment] subclass.
 */
class `Fragment-sabtAgahi2` : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view:View= inflater.inflate(R.layout.feragment_sabt_agahi2, container, false)
        var back=view.findViewById<ImageView>(R.id.arrow_page2_addAgahi)
        back.setOnClickListener(){
            activity!!.onBackPressed()
        }
return view
    }


}
