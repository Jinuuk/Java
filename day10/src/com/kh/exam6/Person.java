package com.kh.exam6;
/*
  final : 최종, 마지막의
  final + variable : 초기화 이후 재할당이 불가능하다.
  final + class : 최종 개념으로 하위 개념이 올 수 없다.
  final + method : 상위 개념의 메소드를 하위개념에서 재정의할 수 없다.
*/

public class Person {
  final public void smile() {
    System.out.println("웃다");
  }
}
