package com.kh.exam5;
/*
  checked exception
  throw할 때 명시적으로 throws ~를 입력 (자동 위임 불가)
 */

public class Main2 {
  public static void main(String[] args) {
    try {
      method1();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

  private static void method1() throws InterruptedException {
      method2();
  }

  private static void method2() throws InterruptedException {
      Thread.sleep(1000);
  }
}
