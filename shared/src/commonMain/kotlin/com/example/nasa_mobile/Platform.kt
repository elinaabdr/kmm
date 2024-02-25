package com.example.nasa_mobile

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform