package com.naldana.ejemplo10.utils


import android.net.Uri
import android.util.Log
import java.io.IOException
import java.net.HttpURLConnection
import java.net.MalformedURLException
import java.net.URL
import java.util.*


class NetworkUtils {
    val CURRENCY_API_BASE_URL = "https://api-taller2.herokuapp.com/coin/"


    private val TAG = NetworkUtils::class.java.simpleName

    fun buildUrl(root: String, currencyId: String): URL {
        val builtUri = Uri.parse(CURRENCY_API_BASE_URL)
            .buildUpon()
            .appendPath(root)
            .appendPath(currencyId)
            .build()

        val url = try {
            URL(builtUri.toString())
        } catch (e: MalformedURLException) {
            URL("")
        }

        Log.d(TAG, "Built URI $url")

        return url
    }

    @Throws(IOException::class)
    fun getResponseFromHttpUrl(url: URL): String {
        val urlConnection = url.openConnection() as HttpURLConnection

        try {

            val `in` = urlConnection.inputStream

            val scanner = Scanner(`in`)
            scanner.useDelimiter("\\A")



            val hasInput = scanner.hasNext()



            return if (hasInput) {
                scanner.next()
            } else {
                ""
            }
        } finally {

            urlConnection.disconnect()
        }
    }
}