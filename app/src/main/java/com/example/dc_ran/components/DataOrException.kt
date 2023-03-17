package com.example.dc_ran.components

data class DataOrException<T, Boolean, e: Exception>(
    var data: T? = null,
    var loadingState: Boolean? = null,
    var exception: e? = null
)