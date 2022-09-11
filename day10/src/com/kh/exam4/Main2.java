package com.kh.exam4;

import com.sun.security.jgss.GSSUtil;

public class Main2 {
  public static void main(String[] args) {
    int x = 10;
    double y = x; //작은 타입을 큰 타입에 대입 => 자동 형변환

    double i = 20;
    //int j = i; //큰 타입을 작은 타입에 대입할 수 없다.
    int j = (int)i; //큰 타입을 작은 타입에 대입하려면 형변환 연산자를 사용해서 강제로 형변환 해준다. (값의 손실이 없는 전제하)


    byte k = 127;  //-128 ~ 127까지의 값의 범위를 갖는다.

    byte l = (byte)(k + 1); //값 손실이 일어남 => 의미없는 연산
    System.out.println(l);

    byte m = (byte)(k - 1);
    System.out.println(m);

    int a = 200;
    byte b = (byte)a; //값 손실이 일어남 => 의미없는 연산
    System.out.println(b);
  }
}
