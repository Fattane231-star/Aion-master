package com.example.aion.Fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.aion.R


/**
 * A simple [Fragment] subclass.
 */
class Fragment_categury : Fragment() {


       override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentCategury = inflater.inflate(com.example.aion.R.layout.fragment_categury, container, false)

        val text = fragmentCategury.findViewById<TextView>(com.example.aion.R.id.txtamlak)
           text.setOnClickListener {

               val fragment = Fragment_Amlak()
               val fragmentManager = activity!!.getSupportFragmentManager()
               val fragmentTransaction  = fragmentManager.beginTransaction()
               fragmentTransaction.replace(R.id.framcenter, fragment)
               fragmentTransaction.addToBackStack(null)
               fragmentTransaction.commit()

           }

        return fragmentCategury
    }




}
