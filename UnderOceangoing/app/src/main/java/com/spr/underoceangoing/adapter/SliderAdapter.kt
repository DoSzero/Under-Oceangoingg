package com.spr.underoceangoing.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.spr.underoceangoing.model.AboutPhoto
import com.spr.underoceangoing.R
import com.spr.underoceangoing.databinding.ItemPhotoBinding

class SliderAdapter (
    private val photosList: List<AboutPhoto>
) : RecyclerView.Adapter<SliderAdapter.PhotosHolder>() {

    class PhotosHolder(val itemLayoutBinding: ItemPhotoBinding) :
        RecyclerView.ViewHolder(itemLayoutBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotosHolder {
        val itemLayoutBinding = DataBindingUtil.inflate<ItemPhotoBinding>(
            LayoutInflater.from(parent.context), R.layout.item_photo, parent, false
        )
        return PhotosHolder(itemLayoutBinding)
    }

    override fun getItemCount(): Int {
        return photosList.size
    }

    override fun onBindViewHolder(holder: PhotosHolder, position: Int) {
        holder.itemLayoutBinding.photo = photosList[position]
    }


}