package com.nicdeane.model.response

import com.google.gson.annotations.SerializedName

data class MealsCategoriesResponse(private var categories: List<MealResponse>)

// below is using gson formatter to map the JSON keys to the names of the variables I actually want to use.
data class MealResponse(
    @SerializedName("idCategory") private val  id: String,
    @SerializedName("strCategory") private val  name: String,
    @SerializedName("strCategoryDescription") private val  description: String,
    @SerializedName("strCategoryThumb") private val  imageURL: String
)