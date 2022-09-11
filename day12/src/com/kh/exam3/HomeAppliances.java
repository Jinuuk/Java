package com.kh.exam3;
/*
  인터페이스 특징
   1.멤버 필드는 상수(static final)만 올 수 있다. (static final 생략 가능)
   2.멤버 메소드는 추상 메소드(메소드 선언부 : 호출 이름, 입력, 출력)가 온다.
   3.모든 멤버는 public (public 키워드를 명시하지 않아도 자동으로 public)
   4.인스턴스는 만들 수 없지만 타입으로는 사용 가능 (구현체 대입) *중요*
   5.인터페이스 구현은 다중 구현이 가능
   6.인터페이스 간의 상속은 단일 상속
   7.인터페이스는 생성자 메소드가 없다. (추상 클래스는 생성자 메소드가 있다.)
 */

public interface HomeAppliances {

  //표준 전압
  int voltage = 220; //public static final 생략

  //전원을 켜다
  abstract void on(); //인터페이스를 정의할 때는 "abstract"를 붙이지 않아도 된다.

  //전원을 끄다
  void off();
}
