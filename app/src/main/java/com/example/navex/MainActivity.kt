package com.example.navex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var number = 1
    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navController = Navigation.findNavController(this,R.id.nav_host_fragment)
        btn_next.setOnClickListener {
            when(number){
                1->{
                    number=2
                    navController.navigate(R.id.action_firstFragment_to_secondFragment)
                }
                2->{
                    number = 3
                    navController.navigate(R.id.action_secondFragment_to_thirdFragment)
                }
                3->{
                    number=1
                    navController.navigate(R.id.action_thirdFragment_to_firstFragment)
                }
            }
        }
    }
}
