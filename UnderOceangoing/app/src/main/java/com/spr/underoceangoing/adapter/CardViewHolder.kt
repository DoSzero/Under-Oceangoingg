package com.spr.underoceangoing.adapter

import androidx.recyclerview.widget.RecyclerView
import com.spr.underoceangoing.interfaces.InfoClickListener
import com.spr.underoceangoing.databinding.CardCellBinding
import com.spr.underoceangoing.model.Info

class CardViewHolder(
    private val cardCellBinding: CardCellBinding,
    private val clickListener: InfoClickListener
) : RecyclerView.ViewHolder(cardCellBinding.root) {

    fun bindInformation(info: Info) {
        cardCellBinding.cover.setImageResource(info.cover)
        cardCellBinding.title.text = info.title
        cardCellBinding.author.text = info.author

        cardCellBinding.cardView.setOnClickListener{
            clickListener.onClick(info)
        }
    }
}