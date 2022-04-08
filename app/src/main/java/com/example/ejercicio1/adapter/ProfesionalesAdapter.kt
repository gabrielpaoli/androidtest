package com.example.ejercicio1.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.ejercicio1.R
import com.example.ejercicio1.entities.Profesional

class ProfesionalesAdapter (
    var profesionalList : MutableList <Profesional>,
    var onClick : (Int) -> Unit
) : RecyclerView.Adapter<ProfesionalesAdapter.ProfesionalHolder>() {

    class ProfesionalHolder (v: View) : RecyclerView.ViewHolder(v) {
        private var view: View
        init {
            this.view = v
        }
        fun setTitle (title : String){
            var txtTitle : TextView = view.findViewById(R.id.txtTitleProfesional)
            txtTitle.text = title
        }

        fun getCardView () : CardView {
            return view.findViewById(R.id.cardProfesional)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfesionalHolder {
        val view =  LayoutInflater.from(parent.context).inflate(R.layout.item_profesional,parent,false)
        return (ProfesionalHolder(view))
    }

    override fun onBindViewHolder(holder: ProfesionalHolder, position: Int) {
        holder.setTitle(profesionalList[position].firstName)
        holder.getCardView().setOnClickListener {
            onClick(position)
        }
    }

    override fun getItemCount(): Int {
        return profesionalList.size
    }

}