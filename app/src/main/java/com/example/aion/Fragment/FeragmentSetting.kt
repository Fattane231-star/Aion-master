package com.example.aion.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import com.example.aion.R

class FeragmentSetting : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view:View= inflater.inflate(R.layout.setting, container, false)
var v=view.findViewById<LinearLayout>(R.id.LL_settingChatVaNotification)
        v.setOnClickListener(){
            val fragment = FragmentSettingChatVaNotification()
            val fragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framcenter, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }
        var back=view.findViewById<ImageView>(R.id.arrow_setting)
        back.setOnClickListener(){
            activity!!.onBackPressed()
        }

        return view
    }


}