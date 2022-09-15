package com.fastcampus.kotlinjava.jvmstatic;

/**
 * @see JvmFieldClass
 */
public class JvmFieldExample {
    public static void main(String[] args) {

        //자바에서는 사용할경우는 컴패니언 사용해야함
        JvmFieldClass.Companion.getId();
        JvmFieldObject.INSTANCE.getName();

        //상수같은경우직접 접근이 가능함
        int code = JvmFieldClass.CODE;
        String familyName = JvmFieldObject.FAMILY_NAME;

        //@JvmField 을 사용하게되면 직접 접근이가능해짐
        String address = JvmFieldClass.address;
        int age = JvmFieldObject.age;

    }
}
