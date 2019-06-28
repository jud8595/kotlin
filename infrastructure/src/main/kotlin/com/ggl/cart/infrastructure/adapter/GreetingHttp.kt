package com.ggl.cart.infrastructure.adapter

import com.ggl.cart.domain.IGreetingAdapter
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import org.json.JSONObject

class GreetingHttp: IGreetingAdapter {

    override fun greet(): String {
        val url = "http://www.mocky.io/v2/5d14927b2f00007405c4f240"  // returns {"hello":"world"}
        val get = GET(url)
        return parseJson(get)
    }

    fun GET(url: String): Response {
        val client = OkHttpClient()
        val request = Request.Builder()
                .url(url)
                .build()
        val call = client.newCall(request)
        return call.execute()
    }

    fun parseJson(response: Response): String {
        val responseData = response.body()?.string()
        var json = JSONObject(responseData)
        return json.getString("hello")
    }
}