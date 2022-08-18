package com.pujiarto.hololivetalent

import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions

class TalentDetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_IMAGE = "extra_image"
        const val EXTRA_JPNAME = "extra_jpname"
        const val EXTRA_NAME = "extra_name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_talent_detail)

        val talentName: TextView = findViewById(R.id.nameTalentDetail)
        val talentJpName: TextView = findViewById(R.id.jpNameTalentDetail)
        val talentImg: ImageView = findViewById(R.id.imageTalentDetail)

        val name = intent.getStringExtra(EXTRA_NAME)
        val jpName = intent.getStringExtra(EXTRA_JPNAME)
        val talentPhoto = intent.getStringExtra(EXTRA_IMAGE)
        val uri: Uri = Uri.parse(talentPhoto)

        talentName.text = name
        talentJpName.text = jpName
        talentImg.setImageURI(uri)

    }
}