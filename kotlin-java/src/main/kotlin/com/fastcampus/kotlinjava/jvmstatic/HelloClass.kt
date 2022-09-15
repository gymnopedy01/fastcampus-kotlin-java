package com.fastcampus.kotlinjava.jvmstatic

class HelloClass {

    //컨매니언 오브젝트
    companion object {
        @JvmStatic
        fun hello() = "hello!"
    }

}

object HiObject {
    @JvmStatic
    fun hi() = "hi!"
}

fun main() {

    //캠패니언오브젝트 호출
    val hello = HelloClass.hello()

    //오브젝트 호출
    val hi = HiObject.hi()

}

//코틀린은 기본적으로 static property를 지원하지 안음
//다만 동반객체와 object키워드로 정의된 싱글턴 객체를 사용하면 스태틱 프로퍼티와 유사하게 사용할수잇음