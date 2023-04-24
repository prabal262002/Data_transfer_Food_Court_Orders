package com.example.foodcourtorders

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
//import kotlinx.android.synthetic.main.activity_2.textView2

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val order = intent.getStringExtra(MainActivity.KEY)
        val textview2 = findViewById<TextView>(R.id.textView2)
        textview2.text = order.toString()
    }
}