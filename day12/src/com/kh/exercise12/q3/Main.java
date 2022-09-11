package com.kh.exercise12.q3;

public class Main {
  public static void main(String[] args) {
    A a = new A() {
      @Override
      void abc() {
        System.out.println("반갑습니다");
      }
    };

    A b = new A() {
      @Override
      void abc() {
        System.out.println("반갑습니다2");
      }
    };

    a.abc();
    System.out.println();

    b.abc();
    System.out.println();

    A c = new B();
    c.abc();
    A d = new B();
    d.abc();

  }
}
