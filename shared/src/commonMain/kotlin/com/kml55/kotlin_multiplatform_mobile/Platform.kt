package com.kml55.kotlin_multiplatform_mobile

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform