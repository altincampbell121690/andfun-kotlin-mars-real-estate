/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.example.android.marsrealestate.network

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "https://mars.udacity.com/"

// TODO Use the Moshi Builder toe Create a Moshi Object with the Kotlin


// TODO Use retroftit builder with scalarsConverterFacotory and Base_Url
private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()
//TODO implement the MarsApiService interface with @GET getProperties returning a  string

interface  MarsApiService{
    @GET("realestate") // get method that returns a string?
    fun  getProperties():
            Call<String>
}
// TODO Create the Marps API object using RetroFit to implement the MarsAPiService
object MarsApi {
    val retrofitService : MarsApiService by lazy{ // what does lazy mean?
        retrofit.create(MarsApiService::class.java)
    }
}
