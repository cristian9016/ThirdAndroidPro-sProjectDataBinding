package com.example.cristiandev.thirdandroidprosprojectbinding.model

import android.annotation.SuppressLint
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.*

/**
 * Created by CristianDev on 6/12/2017.
 */
@SuppressLint("ParcelCreator")
@Parcelize
class Movie (val imagen:String,
             val nombre:String?,
             val duracion:Int,
             val date:Date,
             val sinopsis:String):Parcelable