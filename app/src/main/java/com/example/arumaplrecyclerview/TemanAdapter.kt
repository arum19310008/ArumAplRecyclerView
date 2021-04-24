package com.example.arumaplrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.ScrollingTabContainerView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.teman_item.*

class TemanAdapter(private val context: Context, private val items: ArrayList<Teman>)
    : RecyclerView.Adapter<TemanAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)=ViewHolder(
        LayoutInflater.from(context).inflate(R.layout.teman_item, parent, false)
    )

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.bindItem(items.get(position))
    }
  class ViewHolder(override val containerView:View) :
          RecyclerView.ViewHolder(containerView), LayoutContainer{
      fun bindItem(item:Teman){
          txtTemanNama.text=item.nama
          txtTemanEmail.text=item.email
          txtTemanTelp.text=item.telp
      }
  }
}