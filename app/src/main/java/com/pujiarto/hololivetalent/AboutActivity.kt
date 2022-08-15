package com.pujiarto.hololivetalent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        var img_profile: ImageView = findViewById(R.id.img_profile)
        var name_profile: TextView = findViewById(R.id.name_profile)
        var email_profile: TextView = findViewById(R.id.email_profile)


    }
}