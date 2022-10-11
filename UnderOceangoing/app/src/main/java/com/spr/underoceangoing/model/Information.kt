package com.spr.underoceangoing.model

import com.spr.underoceangoing.model.ConstantsForInfo.infoList

data class Info (
    var cover: Int,
    var author: String,
    var title: String,
    var description: String,
    val id: Int? = infoList.size
)