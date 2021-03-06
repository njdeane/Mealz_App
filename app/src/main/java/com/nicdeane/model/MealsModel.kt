package com.nicdeane.model

import com.nicdeane.model.api.MealsWebService
import com.nicdeane.model.response.MealsCategoriesResponse
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

// MODEL LOGIC

class MealsModel(private val webService: MealsWebService = MealsWebService()) {

    fun getMeals(successCallback: (response: MealsCategoriesResponse?) -> Unit) {
        return webService.getMeals().enqueue(object : retrofit2.Callback<MealsCategoriesResponse> {
            override fun onResponse(
                call: Call<MealsCategoriesResponse>,
                response: Response<MealsCategoriesResponse>
            ) {
                if (response.isSuccessful)
                    successCallback(response.body())
            }

            override fun onFailure(call: Call<MealsCategoriesResponse>, t: Throwable) {

            }
        })
    }
}