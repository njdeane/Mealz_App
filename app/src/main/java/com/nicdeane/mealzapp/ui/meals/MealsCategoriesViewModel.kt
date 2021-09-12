package com.nicdeane.mealzapp.ui.meals

import androidx.lifecycle.ViewModel
import com.nicdeane.model.MealsModel
import com.nicdeane.model.response.MealResponse
import com.nicdeane.model.response.MealsCategoriesResponse


// PRESENTATION LOGIC

class MealsCategoriesViewModel(private val model: MealsModel = MealsModel()): ViewModel() {

    fun getMeals(successCallback: (response: MealsCategoriesResponse?) -> Unit) {
        model.getMeals { response ->
            successCallback(response)
        }
    }

}