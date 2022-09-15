package com.fastcampus.kotlinjava.exception;

import java.io.IOException;

public class JavaThrow {

    public static void main(String[] args) {

//        JavaThrow javaThrow = new JavaThrow();
//
//        try {
//            javaThrow.throwIOException();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        KotlinThrow kotlinThrow = new KotlinThrow();
        try {
            kotlinThrow.throwIOException();
        } catch (IOException e) {

        }


    }

    public void throwIOException() throws IOException {
        throw new IOException("체크드익셉션인 IOException 발생");
    }
}
