package com.ibrahimmakashi.recycleview21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

//    private lateinit var songsList: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var songsList : RecyclerView = findViewById(R.id.songsList)

        val songs = listOf("Hello","ABCD", "Dance", "Chill", "Coders","Chezy","Ibrahim","Makashi","Good night")
        songsList.adapter = MyAdapter(songs)
        songsList.layoutManager = LinearLayoutManager(this)
    }
}