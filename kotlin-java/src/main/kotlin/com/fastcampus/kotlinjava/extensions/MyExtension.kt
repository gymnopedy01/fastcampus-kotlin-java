package com.fastcampus.kotlinjava.extensions

fun String.first(): Char {
    return this[0]
}

fun String.addFirst(char: Char): String {
    return char + this.substring(0)
}

fun main() {

    //코틀린에서는 해당객체의 확장하는것처럼 사용가능함
    println("ABCD".first())
    println("ABCD".addFirst('_'))

}