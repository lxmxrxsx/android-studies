package br.com.cwi.nespresso.data.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create

object RetrofitConfig {
//json-server --host 192.168.2.112 db.json
    val service: NespressoApi =
        Retrofit
            .Builder()
            .baseUrl("http://192.168.2.112:3000")
            .addConverterFactory(
                MoshiConverterFactory
                    .create(
                        Moshi
                            .Builder()
                            .addLast(KotlinJsonAdapterFactory())
                            .build()
                )
            )
            .build()
            .create(NespressoApi::class.java)
}