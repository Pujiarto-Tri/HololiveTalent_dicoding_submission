package com.pujiarto.hololivetalent

import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NavUtils
import org.w3c.dom.Text

class TalentDetailActivity : AppCompatActivity() {

    private var title: String = "Talent Detail"

    companion object {
        const val EXTRA_IMAGE = "extra_image"
        const val EXTRA_JPNAME = "extra_jpname"
        const val EXTRA_UNIT = "extra_unit"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DESCRIPTION = "extra_description"
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

        val name = intent.getStringExtra(EXTRA_NAME)
        val jpName = intent.getStringExtra(EXTRA_JPNAME)
        val unit = intent.getStringExtra(EXTRA_UNIT)
        val talentPhoto = intent.getIntExtra(EXTRA_IMAGE, 0)
        val description = intent.getStringExtra(EXTRA_DESCRIPTION)

        talentName.text = name
        talentJpname.text = jpName
        talentUnit.text = unit
        talentImg.setImageResource(talentPhoto)
        talentDescription.text = description
    }
    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.getItemId()) {
            android.R.id.home -> {
                NavUtils.navigateUpFromSameTask(this)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}