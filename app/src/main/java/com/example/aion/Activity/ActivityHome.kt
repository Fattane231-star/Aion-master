package com.example.aion.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

import com.example.aion.Fragment.*
import com.example.aion.R


class ActivityHome : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        buttomnavin.setOnNavigationItemSelectedListener {item ->

            when(item.itemId)
            {
               R.id.divarHome ->{

                    val fragment = Fragment_home()
                    val fragmentManager = this.supportFragmentManager
                    val fragmentTransaction = fragmentManager.beginTransaction()
                    fragmentTransaction.replace(R.id.framcenter, fragment)
                    fragmentTransaction.addToBackStack(null)
                    fragmentTransaction.commit()
                }

               R.id.categuryHome ->{

                    val fragment = Fragment_categury()
                    val fragmentManager = this.supportFragmentManager
                    val fragmentTransaction = fragmentManager.beginTransaction()
                    fragmentTransaction.replace(R.id.framcenter, fragment)
                    fragmentTransaction.addToBackStack(null)
                    fragmentTransaction.commit()

                }
               R.id.newaddHome ->{
                 startActivity(Intent(this, ActivitySabtAgahi::class.java))

                }
               R.id.chatHome ->{
                    val fragment = Fragment_chat()
                    val fragmentManager = this.supportFragmentManager
                    val fragmentTransaction = fragmentManager.beginTransaction()
                    fragmentTransaction.replace(R.id.framcenter, fragment)
                    fragmentTransaction.addToBackStack(null)
                    fragmentTransaction.commit()

                }
              R.id.mydivarHome ->{
                    val fragment = Fragment_mydivar()
                    val fragmentManager = this.supportFragmentManager
                    val fragmentTransaction = fragmentManager.beginTransaction()
                    fragmentTransaction.replace(R.id.framcenter, fragment)
                    fragmentTransaction.addToBackStack(null)
                    fragmentTransaction.commit()
                }
            }

            true

        }



    }
}
