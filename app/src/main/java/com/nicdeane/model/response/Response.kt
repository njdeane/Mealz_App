package com.nicdeane.model.response

import com.google.gson.annotations.SerializedName

data class MealsCategoriesResponse(var categories: List<MealResponse>)

// below is using gson formatter to map the JSON keys to the names of the variables I actually want to use.
data class MealResponse(
    @SerializedName("idCategory") val  id: String,
    @SerializedName("strCategory") val  name: String,
    @SerializedName("strCategoryDescription") val  description: String,
    @SerializedName("strCategoryThumb") val  imageURL: String
)