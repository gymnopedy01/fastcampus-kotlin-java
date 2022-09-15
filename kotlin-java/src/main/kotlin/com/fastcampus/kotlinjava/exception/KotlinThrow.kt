package com.fastcampus.kotlinjava.exception

import java.io.IOException

class KotlinThrow {
    @Throws(IOException::class)
    fun throwIOException() {
        throw IOException("체크드 익셉셧닝ㄴ IOException 발생")
    }
}

fun main() {

    val javaThrow = JavaThrow()
    javaThrow.throwIOException()

    val kotlinThrow = KotlinThrow()
    kotlinThrow.throwIOException()
}