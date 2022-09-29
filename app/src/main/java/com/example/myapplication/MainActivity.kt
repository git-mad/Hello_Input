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
        button.setOnClickListener {
            clickListener()
        }
    }
    fun edit(text: String?) {
        var toe = ""
        if (text != null) {
            toe = text
        }
        toe = "Hello $toe"
        val dispText = findViewById<TextView>(R.id.textView)
        dispText.text = toe
    }
    fun clickListener() {
        val editText = findViewById<EditText>(R.id.eT)
        edit(editText.text.toString())
    }
}