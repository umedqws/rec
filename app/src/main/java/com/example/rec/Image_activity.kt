package com.example.rec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Image_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)
        val data: ImageView = findViewById(R.id.image)
       val img =  intent.extras?.get("url")
        data.setImageResource(img as Int)

        data.setOnClickListener {
            finish()
        }
    }
}