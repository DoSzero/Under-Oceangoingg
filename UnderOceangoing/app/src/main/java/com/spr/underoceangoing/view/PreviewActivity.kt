package com.spr.underoceangoing.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.spr.underoceangoing.adapter.SliderAdapter
import com.spr.underoceangoing.adapter.SliderTransformer
import com.spr.underoceangoing.databinding.ActivityPreviewBinding
import com.spr.underoceangoing.listOfPhotos

class PreviewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPreviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPreviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewpager.apply {
            adapter = SliderAdapter(listOfPhotos())
            offscreenPageLimit = 4
            setPageTransformer(SliderTransformer(4))
        }

    }
}