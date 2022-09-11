package com.kh.exam2;

public class Main {
  public static void main(String[] args) {
//    AirConditioner airConditioner = new AirConditioner();
//    Tv tv = new Tv();
//    Radio radio = new Radio();
//
//    airConditioner.on();
//    tv.on();
//    radio.on();

    //인스턴스는 만들 수 없지만 타입으로는 사용 가능 (구현체 대입)
    HomeAppliances homeAppliances = new AirConditioner();
    homeAppliances.on();
    System.out.println();

    //인터페이스를 이용한 다형성
    on(new AirConditioner());
    on(new Tv());
    on(new Radio());


  }

  //인스턴스는 만들 수 없지만 타입으로는 사용 가능 (구현체 대입)
  public static void on(HomeAppliances homeAppliances) {
    homeAppliances.on();
    homeAppliances.off();
  }
}
