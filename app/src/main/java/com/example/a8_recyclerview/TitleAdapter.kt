package com.example.a8_recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.google.android.material.imageview.ShapeableImageView

class TitleAdapter(private val titleList: ArrayList<Title>): RecyclerView.Adapter<TitleAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,
            parent,false)

        return MyViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentItem = titleList[position]
        holder.profImage.setImageResource(currentItem.prof)
        holder.roleTitle.text = currentItem.role

    }

    override fun getItemCount(): Int {
        return titleList.size
    }


    class MyViewHolder(itemView : View) : ViewHolder(itemView){

        val profImage : ShapeableImageView = itemView.findViewById(R.id.profImg)
        val roleTitle : TextView = itemView.findViewById(R.id.roleTitle)

    }


}