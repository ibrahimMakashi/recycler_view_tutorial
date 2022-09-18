package com.ibrahimmakashi.recycleview21

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.NonDisposableHandle.parent
import kotlinx.coroutines.newCoroutineContext

class MyAdapter(val songs : List<String>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.layout_item,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.txtTile.text = songs[position]
    }

    override fun getItemCount(): Int {
        return songs.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var txtTile = itemView.findViewById<TextView>(R.id.txtTitle)
        var txtDescription = itemView.findViewById<TextView>(R.id.txtDescription)
    }

}