package com.example.project_laundry.ROOM

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.example.project_laundry.R

class adapterlaundry (val list: ArrayList<adapterlaundry>)
    :RecyclerView.Adapter<adapterlaundry.laundryholder>(){

        class laundryholder(view: View) : RecyclerView.ViewHolder(view) {
            val NAMA = itemView.findViewById<TextView>(R.id.nameadapter)
            val JENIS = itemView.findViewById<TextView>(R.id.jenisadapter)
            val ESTIMASI = itemView.findViewById<TextView>(R.id.estimasiadapter)
            val TITIK3 = itemView.findViewById<Button>(R.id.titik3)
            val EDIT = itemView.findViewById<Button>(R.id.edit)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): laundryholder {
            val view = LayoutInflater.from(parent.context).inflate(
                R.layout.adapter,
                parent,
                false

            )
            return laundryholder(view)
        }

        override fun onBindViewHolder(holder: laundryholder, position: Int) {
            holder.NAMA.text  = list[position].toString()
            holder.JENIS.text = list[position].toString()
            holder.ESTIMASI.text = list[position].toString()





        }

        override fun getItemCount(): Int {
            return list.size
        }
    }


