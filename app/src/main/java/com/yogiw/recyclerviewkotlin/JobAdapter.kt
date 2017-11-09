package com.yogiw.recyclerviewkotlin

import android.content.Context
import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

/**
 * Created by Yogi Wisesa on 11/6/2017.
 */

class JobAdapter(var context: Context?, var list: List<JobClass>?) : RecyclerView.Adapter<JobAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context).inflate(R.layout.itemlayout, parent, false)

        return ViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder!!.tvName.text = list!![position].name
        holder.tvJob.text = list!![position].job
        holder.layout.setOnClickListener {
            Toast.makeText(context,"Item $position clicked!", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return list!!.size
    }


    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        var tvName = itemView?.findViewById<View>(R.id.tvName) as TextView
        var tvJob = itemView?.findViewById<View>(R.id.tvJob) as TextView
        var layout = itemView?.findViewById<View>(R.id.layout) as LinearLayout
    }
}
