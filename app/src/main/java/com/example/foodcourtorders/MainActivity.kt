package com.example.foodcourtorders

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
//import kotlinx.android.synthetic.main.activity_main.Text1
//import kotlinx.android.synthetic.main.activity_main.Text2
//import kotlinx.android.synthetic.main.activity_main.Text3
//import kotlinx.android.synthetic.main.activity_main.Text4
//import kotlinx.android.synthetic.main.activity_main.btnorder

class MainActivity : AppCompatActivity() {


    companion object{
        const val KEY = "com.example.foodcourtorders.MainActivity.KEY"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnorder = findViewById<Button>(R.id.btnorder)
        btnorder.setOnClickListener {
            val text1 = findViewById<TextView>(R.id.Text1)
            val text2 = findViewById<TextView>(R.id.Text2)
            val text3 = findViewById<TextView>(R.id.Text3)
            val text4 = findViewById<TextView>(R.id.Text4)
            val ordertext = text1.text.toString() + ", " + text2.text.toString()+", "+ text3.text.toString()+", "+
                            text4.text.toString();
            intent = Intent(this,Activity2::class.java)
            intent.putExtra(KEY,ordertext)
            startActivity(intent)
        }
    }
}