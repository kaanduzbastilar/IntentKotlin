 package com.kaanduzbastilar.intentkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.kaanduzbastilar.intentkotlin.databinding.ActivityMainBinding

 private lateinit var binding: ActivityMainBinding

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

     override fun onStart() {
         super.onStart()
     }

     override fun onResume() {
         super.onResume()
     }

     override fun onPause() {
         super.onPause()
     }

     override fun onDestroy() {
         super.onDestroy()
     }

     override fun onRestart() {
         super.onRestart()
     }


    fun next(view : View){

        val intent = Intent(this@MainActivity, NextActivity::class.java)
        intent.putExtra("name", binding.editTextText.text.toString())
        startActivity(intent)
        finish()


    }

}