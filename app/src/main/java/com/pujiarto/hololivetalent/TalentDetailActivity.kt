package com.pujiarto.hololivetalent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class TalentDetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_IMG = "extra_img"
        const val EXTRA_JPNAME = "extra_jpname"
        const val EXTRA_NAME = "extra_name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_talent_detail)

        val talentName: TextView = findViewById(R.id.nameTalentDetail)
        val talentImg: ImageView = findViewById(R.id.imageTalentDetail)

        val name = intent.getStringExtra(EXTRA_NAME)
        val img = intent.getStringExtra(EXTRA_IMG)

        talentImg
        talentName.text = name
    }
}