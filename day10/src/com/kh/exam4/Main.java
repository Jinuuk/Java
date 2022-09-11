package com.kh.exam4;

public class Main {
  public static void main(String[] args) {
    Person p1 = new Person();
    p1.eat();
    p1.smile();
//    p1.study();

    System.out.println("");

    Student s1 = new Student();
    s1.smile();
    s1.eat();
    s1.study();
//    s1.teach();

    System.out.println("");

    Teacher t1 = new Teacher();
    t1.eat();
    t1.smile();
    t1.teach();
//    t1.study();

    //하위개념을 상위개념에 대입 가능
    //하위개념의 실체를 상위개념으로 다루겠다.
    Person p2 = s1; //자동 형변환

    //상위개념을 하위개념에 대입 불가능
//    Student s2 = p2;
    Student s2 = (Student)p2; //강제 형변환, p2의 실체는 s1이기 때문에 문제 없음
    s2.study();

    //컴파일 시점에서는 오류가 나지 않지만 런타임 시점에서는 형변환 할 수 없다는 오류 발생
    //강제 형변환의 전제조건 : 실체가 강제 형변환하려는 타입이어야 한다.
    Person p3 = p1;
    Student s3 = (Student)p3; //강제 형변환, p3의 실체는 p1이기 때문에 문제 발생
    s3.study();
  }
}
