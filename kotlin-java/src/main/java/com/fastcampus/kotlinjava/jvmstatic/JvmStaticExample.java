package com.fastcampus.kotlinjava.jvmstatic;

public class JvmStaticExample {

    public static void main(String[] args) {
        //컴패니언클래스호출
        String hello = HelloClass.Companion.hello();

        //오브젝트호출
        String hi = HiObject.INSTANCE.hi();

        //이렇게 호출하게되면 중간에 불필요한 코드들이 들어가 불편함
        //그래서 코틀린에서는 JVMSTATIC이라는걸 제공함
        //자바에서 스태틱 메서드를 사용하듯이 클래스 지시자로 접근 가능해짐
        HelloClass.hello();

        HiObject.hi();
    }
}
