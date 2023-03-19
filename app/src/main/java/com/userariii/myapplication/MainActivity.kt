package com.userariii.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val uploadButton = findViewById<Button>(R.id.upBTN)
        val downloadButton = findViewById<Button>(R.id.dlBTN)

        uploadButton.setOnClickListener {
            Toast.makeText(applicationContext, "Uploading...", Toast.LENGTH_SHORT).show()
        }

        downloadButton.setOnClickListener {
            Toast.makeText(applicationContext, "Download...", Toast.LENGTH_SHORT).show()
        }
    }
}