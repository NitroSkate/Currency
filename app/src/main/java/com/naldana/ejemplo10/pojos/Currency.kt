package com.naldana.ejemplo10.pojos



import android.os.Parcel
import android.os.Parcelable
import java.io.Serializable

data class Currency(


    val id: String = "N/A",
    val name: String = "N/A",
    val country: String = "N/A",
    val value: String = "N/A",
    val value_us: String = "N/A",
    val year:String = "N/A",
    val review:String = "N/A",
    val isAvailable:String = "N/A",
    val img:String = "N/A"
) : Serializable
