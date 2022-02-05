package com.example.i_m_o__kotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.i_m_o__kotlin.R
import com.example.i_m_o__kotlin.model.Chat
import com.google.android.material.imageview.ShapeableImageView
import java.util.*

class CHatAdapter (var context:Context, var items:ArrayList<Chat>): RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)
        return MessageViewHolder(view)

    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        val chat = items[position]

        if(holder is MessageViewHolder){

            var iv_profile = holder.iv_profile
            var tv_fullname =  holder.tv_fullname
            var tv_count = holder.tv_count

            iv_profile.setImageResource(chat.profile)
            tv_fullname.text = chat.fullName
            tv_count.text = chat.count.toString()

            if(chat.count > 0){
                tv_count.visibility = View.VISIBLE
            }else{
                tv_count.visibility = View.GONE
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }


class MessageViewHolder(var view: View) : RecyclerView.ViewHolder(view) {
    var iv_profile: ShapeableImageView
    var tv_fullname: TextView
    var tv_count: TextView

    init {
        iv_profile = view.findViewById(R.id.iv_profile)
        tv_fullname = view.findViewById(R.id.full_name)
        tv_count = view.findViewById(R.id.tv_count)
    }

}
}

