package com.fastcampus.kotlinjava.gettersetter


import java.time.LocalDate

class Student {

    @JvmField           //자바코드에서는 프로퍼티로만 접근해야함
    var name: String? = null
    var birthDate: LocalDate? = null

    val age: Int = 10
    var grade: String? = null
        private set                         //setter

    fun changeGrade(grade: String) {
        this.grade = grade
    }

}