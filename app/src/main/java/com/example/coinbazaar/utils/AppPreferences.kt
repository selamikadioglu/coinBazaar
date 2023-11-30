package com.example.coinbazaar.utils

interface AppPreferences {
    var userName: String
    fun getToken(): String
    fun setToken(token: String)
    fun hasLogin():Boolean
    fun setLogin(value:Boolean)
}