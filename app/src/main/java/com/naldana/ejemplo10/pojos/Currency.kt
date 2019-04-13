package com.naldana.ejemplo10.pojos



import android.os.Parcel
import android.os.Parcelable


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
) : Parcelable {
    constructor(parcel: Parcel) : this(
        id = parcel.readString(),
        name = parcel.readString(),
        country = parcel.readString(),
        value = parcel.readString(),
        value_us = parcel.readString(),
        year = parcel.readString(),
        review = parcel.readString(),
        isAvailable = parcel.readString(),
        img = parcel.readString()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(id)
        parcel.writeString(name)
        parcel.writeString(country)
        parcel.writeString(value)
        parcel.writeString(value_us)
        parcel.writeString(year)
        parcel.writeString(review)
        parcel.writeString(isAvailable)
        parcel.writeString(img)

    }

    override fun describeContents() = 0

    companion object {
        @JvmField val CREATOR = object : Parcelable.Creator<Currency> {
            override fun createFromParcel(parcel: Parcel): Currency = Currency(parcel)
            override fun newArray(size: Int): Array<Currency?> = arrayOfNulls(size)
        }
    }
    }