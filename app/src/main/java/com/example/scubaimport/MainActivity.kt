package com.example.scubaimport

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.scubaimport.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tankWrapper = TankWrapper()
        //binding.tank.text = tankWrapper.toString()
    }

    companion object {
        init {
            System.loadLibrary("tank")
        }
    }
}