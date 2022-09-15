package com.fastcampus.kotlinjava.extensions;

public class ExtensionExample {
    public static void main(String[] args) {
//        "ABCD".first();
//        "ABCD".addFirst('z');

        
        //자바에서는 스태틱 메서드 형태로 호출해야함
        char first = MyExtensionKt.first("ABCD");
        System.out.println(first);
        
        String addFirst = MyExtensionKt.addFirst("ABCD", 'Z');
        System.out.println(addFirst);
    }
}
