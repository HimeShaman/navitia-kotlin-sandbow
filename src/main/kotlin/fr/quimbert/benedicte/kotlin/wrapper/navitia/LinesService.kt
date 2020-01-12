package fr.quimbert.benedicte.kotlin.wrapper.navitia

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface LinesService {
    @GET("coverage/{region}/lines?")
    fun findLines(@Path("region") region:String,
                  @Header("Authorization") authorization:String
    ): Call<LinesResult>

}