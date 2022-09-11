package com.kh.exercise10.q11;
/*
  Object.equals() : 동일 비교(==)로 정의되어있다.
  동일 비교를 하기 위해서는 Object.equals()를 재정의해서 사용한다.

  동일 비교 : 인스턴스의 실체가 같은지 비교 (주소 비교)
  동등 비교 : 인스턴스의 속성값이 같은지 비교
 */

public class A {
  int data;

  A(int data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object obj) {
    boolean result = false;
    if (obj instanceof A) {
      if (this.data == ((A)(obj)).data) {
        result = true;
      }
    }
    return result;
  }
}
