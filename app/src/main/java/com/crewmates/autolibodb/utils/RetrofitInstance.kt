package com.crewmates.autolibodb.utils


import com.crewmates.autolibodb.api.LocationUpdateApi
import com.crewmates.autolibodb.api.TechDetailsUpdateApi
import com.crewmates.autolibodb.utils.Constants.Companion.LOCATION_BASE_URL
import com.crewmates.autolibodb.utils.Constants.Companion.STATE_BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitInstance {


    private val retrofitLocation by lazy {
        Retrofit.Builder()
            .baseUrl(LOCATION_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val locationApi : LocationUpdateApi by lazy {
        retrofitLocation.create(LocationUpdateApi::class.java)
    }

    private val retrofitState by lazy {
        Retrofit.Builder()
            .baseUrl(STATE_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val stateApi : TechDetailsUpdateApi by lazy {
        retrofitState.create(TechDetailsUpdateApi::class.java)
    }
}