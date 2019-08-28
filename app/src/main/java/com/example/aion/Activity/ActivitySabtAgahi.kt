
package com.example.aion.Activity


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aion.Fragment.Fragment_sabtAgahi1
import com.example.aion.R


class ActivitySabtAgahi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sabt_agahi1)


            val fragment = Fragment_sabtAgahi1()
            val fragmentManager = this.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.LL_Frame_sabt_agahi1, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()



    }
}
