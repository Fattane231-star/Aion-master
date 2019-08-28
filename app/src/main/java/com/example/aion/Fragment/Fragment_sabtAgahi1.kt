package com.example.aion.Fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import com.example.aion.R

/**
 * A simple [Fragment] subclass.
 */
class Fragment_sabtAgahi1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view: View=inflater.inflate(R.layout.fragment_sabt_agahi1, container, false)
        var b=view.findViewById<Button>(R.id.btn_page1_sabtagahi)
        b.setOnClickListener(){
            val fragment = `Fragment-sabtAgahi2`()
            val fragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.LL_Frame_sabt_agahi1, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()

        }
        var back=view.findViewById<ImageView>(R.id.arrow_newAdd)
        back.setOnClickListener(){
            activity!!.onBackPressed()
        }

        return view
    }


}
