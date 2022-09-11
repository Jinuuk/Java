package com.kh.exam6singleton;

import java.util.Calendar;

public class Main {
  public static void main(String[] args) {
    Dictionary d1 = Dictionary.getInstance();
    Dictionary d2 = Dictionary.getInstance();

    System.out.println(d1 == d2);
    System.out.println(d1.hashCode());
    System.out.println(d2.hashCode());

//    Map map = d1.getStore();
//    map.put("student", "학생");
//    map.put("teacher", "선생");
    d1.getStore().put("student", "학생");
    d1.getStore().put("teacher", "선생");
    d2.getStore().put("classroom", "교실");

    System.out.println(d1);

    //모양은 같지만 싱글턴 패턴이 아님
    Calendar cal1 = Calendar.getInstance();
    System.out.println(cal1.getTime());
    Calendar cal2 = Calendar.getInstance();
    System.out.println(cal1 == cal2);

    System.out.println(cal1.hashCode());
    System.out.println(cal2.hashCode());

  }
}
