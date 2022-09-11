package com.kh.exercise10.q8;

public class Main {
  public static void main(String[] args) {

//    A ab = new B();
//    System.out.println(ab.m); //6(x) -> 2 (멤버 필드는 재정의가 안됨)
//    System.out.println(ab.n); //4
//    System.out.println(A.n); //4 권장
//    System.out.println(B.n); //8 권장
//    ab.method1(); //B
//    ab.method2(); //A
//    System.out.println();

    B b = new B();
    System.out.println(b.m);
    System.out.println(b.n);

  }
}
