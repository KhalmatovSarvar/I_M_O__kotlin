package com.example.i_m_o__kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.i_m_o__kotlin.adapter.CHatAdapter
import com.example.i_m_o__kotlin.model.Chat


class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    fun initView() {
        recyclerView = findViewById<RecyclerView>(R.id.recycle)
        recyclerView.setLayoutManager(GridLayoutManager(this, 1))

        refreshAdapter(getAllChats())
    }

    fun refreshAdapter(chats:ArrayList<Chat>){
        val adapter = CHatAdapter(this,chats)
        recyclerView!!.adapter = adapter
    }

    fun getAllChats():ArrayList<Chat>{
        val chats: ArrayList<Chat> = ArrayList()

        chats.add(Chat(R.drawable.sherzod, fullName = "Jo`rabekov Sherzod",1))
        chats.add(Chat(R.drawable.img, fullName = "Sarvarbek Xalmatov",2))
        chats.add(Chat(R.drawable.tohir, fullName = "Rahmatullayev Tohir",0))
        chats.add(Chat(R.drawable.img, fullName = "Sarvarbek Xalmatov",3))
        chats.add(Chat(R.drawable.img, fullName = "Sarvarbek Xalmatov",1))
        chats.add(Chat(R.drawable.sherzod, fullName = "Jo`rabekov Sherzod",1))
        chats.add(Chat(R.drawable.tohir, fullName = "Rahmatullayev Tohir",5))
        chats.add(Chat(R.drawable.sherzod, fullName = "Jo`rabekov Sherzod",1))
        chats.add(Chat(R.drawable.tohir, fullName = "Rahmatullayev Tohir",8))
        chats.add(Chat(R.drawable.img, fullName = "Sarvarbek Xalmatov",1))
        chats.add(Chat(R.drawable.sherzod, fullName = "Jo`rabekov Sherzod",7))
        chats.add(Chat(R.drawable.sherzod, fullName = "Jo`rabekov Sherzod",1))
        chats.add(Chat(R.drawable.tohir, fullName = "Rahmatullayev Tohir",0))
        chats.add(Chat(R.drawable.img, fullName = "Sarvarbek Xalmatov",12))
        chats.add(Chat(R.drawable.sherzod, fullName = "Jo`rabekov Sherzod",1))
    return chats
    }



}