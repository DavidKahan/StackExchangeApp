package com.davidkahan.stackexchange.utils

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

/**
 * Created by David Kahan on 19/10/2020.
 */
class DateFormatter @Inject constructor()  {

    @SuppressLint("SimpleDateFormat")
    private val formatter = SimpleDateFormat("dd/MM/yyyy hh:mm:ss")

    fun formatDate(timestamp: Long): String {
        return formatter.format(Date(timestamp))
    }

}