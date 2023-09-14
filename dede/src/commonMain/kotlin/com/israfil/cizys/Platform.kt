package com.israfil.cizys

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform