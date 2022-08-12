package com.pujiarto.hololivetalent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pujiarto.hololivetalent.data.ListTalentAdapter
import com.pujiarto.hololivetalent.data.Talent
import com.pujiarto.hololivetalent.data.TalentsData

class MainActivity : AppCompatActivity() {
    private lateinit var rvTalents: RecyclerView
    private var list: ArrayList<Talent> = arrayListOf()
    private var title: String = "Hololive"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        rvTalents = findViewById(R.id.rv_talents)
        rvTalents.setHasFixedSize(true)

        list.addAll(TalentsData.listData)
        showRecylerList()

    }

    private fun showRecylerList() {
        rvTalents.layoutManager = LinearLayoutManager(this)
        val listTalentAdapter = ListTalentAdapter(list)
        rvTalents.adapter = listTalentAdapter

        listTalentAdapter.setOnItemClickCallback(object : ListTalentAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Talent) {
                showSelectedTalent(data)
            }
        })
    }

    private fun showSelectedTalent(talent: Talent) {
        Toast.makeText(this, "You Choose" + talent.name, Toast.LENGTH_SHORT)
            .show()
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }
}