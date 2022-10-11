package com.spr.underoceangoing

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.spr.underoceangoing.model.AboutPhoto
import com.spr.underoceangoing.model.Credit
import com.squareup.picasso.Picasso

@BindingAdapter("android:src")
fun bindImageView(view: ImageView, url: String?) {
    Picasso.get()
        .load(url)
        .fit().centerCrop()
        .into(view)
}

fun listOfPhotos(): List<AboutPhoto> {
    val aboutPhotos = mutableListOf<AboutPhoto>()

    aboutPhotos.add(
        AboutPhoto(
            "https://images.unsplash.com/photo-1568660357733-823cbddb0f6a?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80",
            Credit("За последние 20 лет умерло более 150 000 черепах", "@bechir", "https://unsplash.com/@bechir"),
            "Тихий Океан, Tunisia"
        )
    )

    aboutPhotos.add(
        AboutPhoto(
            "https://images.unsplash.com/photo-1572713629470-3e9f5d4fdf4c?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=435&q=80",
            Credit("Более 2500 черепах попадают в сети", "@dascal", "https://unsplash.com/@dascal"),
            "Индийский Океан"
        )
    )

    aboutPhotos.add(
        AboutPhoto(
            "https://images.unsplash.com/photo-1591025207163-942350e47db2?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80",
            Credit("Пластмасса отдаляет море в следствия чего популяция черепах уменьшилась на 36%", "@janiklie", "https://unsplash.com/@janiklie"),
            "Всемирнее води"
        )
    )

    return aboutPhotos
}