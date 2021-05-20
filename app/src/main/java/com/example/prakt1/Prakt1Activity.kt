package com.example.prakt1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class Prakt1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prakt1)

    val btn = findViewById<Button>(R.id.button)
        val textView2 = findViewById<TextView>(R.id.textView2)
        btn.setOnClickListener {
            val random = Random.nextInt(10,99)+1
            textView2.text= random.toString()
        }



    }

    fun random(view: View) {}


}
