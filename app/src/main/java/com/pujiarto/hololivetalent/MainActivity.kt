package com.pujiarto.hololivetalent

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
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
        val detailTalentIntent = Intent(this@MainActivity, TalentDetailActivity::class.java)
        detailTalentIntent.putExtra(TalentDetailActivity.EXTRA_NAME, talent.name)
        startActivity(detailTalentIntent)
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id: Int = item.getItemId()
        if (id == R.id.about_button) {
            title = "About"
            val aboutIntent = Intent(this@MainActivity, AboutActivity::class.java)
            startActivity(aboutIntent)
        }
        return super.onOptionsItemSelected(item)
    }
}