package com.qihaocai.flixster

import com.google.gson.annotations.SerializedName

class Movies {

    @JvmField
    @SerializedName("title")
    var title: String? = null

    @JvmField
    @SerializedName("poster_path")
    var imageUrl: String? = null

    @JvmField
    @SerializedName("overview")
    var description: String? = null
}