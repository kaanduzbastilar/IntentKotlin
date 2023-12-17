package com.kaanduzbastilar.intentkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.kaanduzbastilar.intentkotlin.databinding.ActivityMainBinding
import com.kaanduzbastilar.intentkotlin.databinding.ActivityNextBinding

private lateinit var binding: ActivityNextBinding

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNextBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intentFromMain = intent //getIntent()
        val name = intentFromMain.getStringExtra("name")
        binding.nameText.text = "Name : ${name}"

    }

    fun previous(view: View){
        val intent = Intent(this@NextActivity,ActivityMainBinding::class.java)
        startActivity(intent)
        finish() //close activity
    }

}