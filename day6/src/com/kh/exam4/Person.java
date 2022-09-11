package com.kh.exam4;

import java.lang.*; // 생략되어있음

public class Person { // extends Object 생략되어있음 (상위 개념의 클래스)

    private String name;   //이름
    private int age;       //나이
    private String gender; //성별

//    public Person(){
//        super(); // 상위 개념의 디폴트 생성자 호출
//    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //용도 : 현재 인스턴스의 상태를 문자열로 표현
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
