package com.spr.underoceangoing.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.spr.underoceangoing.interfaces.InfoClickListener
import com.spr.underoceangoing.databinding.CardCellBinding
import com.spr.underoceangoing.model.Info

class CardAdapter(
    private val infos: List<Info>,
    private val clickListener: InfoClickListener
) : RecyclerView.Adapter<CardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = CardCellBinding.inflate(from, parent, false)

        return CardViewHolder(binding, clickListener)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bindInformation(infos[position])
    }

    override fun getItemCount(): Int = infos.size
}