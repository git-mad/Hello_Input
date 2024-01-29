package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val editText = findViewById<EditText>(R.id.eT)
        val textView = findViewById<TextView>(R.id.textView)
        button.setOnClickListener {
            textView.text = "Hello ${editText.text}"
        }
    }

}