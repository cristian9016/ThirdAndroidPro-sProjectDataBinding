package com.example.cristiandev.thirdandroidprosprojectbinding.util

import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by CristianDev on 6/12/2017.
 */
fun ViewGroup.inflate(@LayoutRes layout:Int):View =
        LayoutInflater.from(context).inflate(layout,this,false)
