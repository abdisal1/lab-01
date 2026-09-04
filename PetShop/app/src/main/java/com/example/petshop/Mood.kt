package com.example.petshop

abstract class Mood(val date: String) {

    abstract fun describe(): String

    fun getDate(): String {
        return date
    }
}