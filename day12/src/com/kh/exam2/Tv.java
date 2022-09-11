package com.kh.exam2;

public class Tv implements HomeAppliances, Internet{
  @Override
  public void on() {
    System.out.println("TV를 켜다");
  }

  @Override
  public void off() {
    System.out.println("TV를 끄다");
  }

  @Override
  public String search(String keyword) {
    return keyword;
  }
}
