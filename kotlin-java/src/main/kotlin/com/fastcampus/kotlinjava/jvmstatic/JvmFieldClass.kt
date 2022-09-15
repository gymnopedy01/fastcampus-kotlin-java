package com.fastcampus.kotlinjava.jvmstatic

/**
 * @see JvmFieldExample
 */
class JvmFieldClass {
    companion object {

        val id = 1234

        const val CODE = 1234

        @JvmField
        val address = "nshop.plaync.com"
    }
}

object JvmFieldObject {

    val name = "tony"

    const val FAMILY_NAME = "stark"

    @JvmField
    val age = 27
}

fun main() {

    //코틀린에서는 클래스지시자로 바로 접근이 가능함함
    val id = JvmFieldClass.id
    val name = JvmFieldObject.name
}