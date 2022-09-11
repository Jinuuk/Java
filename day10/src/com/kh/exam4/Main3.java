package com.kh.exam4;

public class Main3 {
  public static void main(String[] args) {

    Person p1 = new Student();
    Person p2 = new Teacher();
    Person p3 = new HighStudent();

    p1.eat();
    System.out.println("");
    p2.eat();
    System.out.println("");
    p3.eat();

    //다형성 구현의 전제조건
    //1) 개념의 관계가 상속 또는 인터페이스 구현 관계여야 한다.
    //2) 상위 개념에 하위 개념을 대입한다.
    //3) 상위 개념의 메소드가 하위 개념의 메소드에서 재정의되어야 한다.

  }
}
