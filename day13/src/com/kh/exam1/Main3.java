package com.kh.exam1;

//호출한 메소드로 예외를 위임

public class Main3 {
  public static void main(String[] args) {

    try {
      method1();
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }

  private static void method1() throws Exception { //형변환 주의, 'throws Exception'을 입력하지 않아도 자동으로 위임 가능
    int[] arr = new int[3];
    arr[3] = 10;
  }
}
