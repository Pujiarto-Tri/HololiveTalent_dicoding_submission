package com.pujiarto.hololivetalent

import android.content.ActivityNotFoundException
import android.content.ComponentName
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class TalentDetailActivity : AppCompatActivity() {

    private var title: String = "Talent Detail"

    companion object {
        const val EXTRA_IMAGE = "extra_image"
        const val EXTRA_JPNAME = "extra_jpname"
        const val EXTRA_UNIT = "extra_unit"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DESCRIPTION = "extra_description"
        const val EXTRA_YT = "extra_yt"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_talent_detail)
        setActionBarTitle(title)

        val talentName: TextView = findViewById(R.id.nameTalentDetail)
        val talentJpname: TextView = findViewById(R.id.jpNameTalentDetail)
        val talentUnit: TextView = findViewById(R.id.unitTalentDetail)
        val talentImg: ImageView = findViewById(R.id.imageTalentDetail)
        val talentDescription : TextView = findViewById(R.id.descriptionTalentDetail)
        val talentYoutube: Button = findViewById(R.id.youtubeTalentDetail)

        val name = intent.getStringExtra(EXTRA_NAME)
        val jpName = intent.getStringExtra(EXTRA_JPNAME)
        val unit = intent.getStringExtra(EXTRA_UNIT)
        val talentPhoto = intent.getIntExtra(EXTRA_IMAGE, 0)
        val description = intent.getStringExtra(EXTRA_DESCRIPTION)
        val youtube = intent.getStringExtra(EXTRA_YT)

        talentName.text = name
        talentJpname.text = jpName
        talentUnit.text = unit
        talentImg.setImageResource(talentPhoto)
        talentDescription.text = description


        val actionShareButton : Button = findViewById(R.id.action_share)
        actionShareButton.setOnClickListener{
            val actionShareIntent = Intent()
            actionShareIntent.action = Intent.ACTION_SEND
            actionShareIntent.putExtra(Intent.EXTRA_TEXT,youtube)
            actionShareIntent.type = "text/plain"
            startActivity(Intent.createChooser(actionShareIntent, youtube))
        }

        talentYoutube.setOnClickListener {
            val talentYoutubeIntentApp = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.$youtube"))
            val talentYoutubeIntentBrowser = Intent(Intent.ACTION_VIEW, Uri.parse(youtube))
            try {
                this.startActivity(talentYoutubeIntentApp)
            } catch (ex: ActivityNotFoundException) {
                this.startActivity(talentYoutubeIntentBrowser)
            }
        }

    }
    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}