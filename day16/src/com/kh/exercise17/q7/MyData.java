package com.kh.exercise17.q7;

import java.util.Comparator;

public class MyData implements Comparable<MyData> {
  String str;

  public MyData(String str) {
    this.str = str;
  }

  @Override
  public int compareTo(MyData o) {
    //System.out.println("compareTo() 호출");
    int result = 0;
    if (this.str.length() > o.str.length()) {
      result = 1;
    } else if (this.str.length() < o.str.length()) {
      result = -1;
    }
    //System.out.println("this : "+this);
    //System.out.println("o : "+o);
    //System.out.println("result : "+result);
    //System.out.println();
    return result;
  }

//  @Override
//  public int compareTo(MyData o) {
//    Integer thisStrLength = this.str.length();
//    Integer oStrLength = o.str.length();
//    return thisStrLength.compareTo(oStrLength);
//  }

  @Override
  public String toString() {
    return str;
  }

  @Override
  public int hashCode() {
    System.out.println("hashCode() 호출");
    return super.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    System.out.println("equals() 호출");
    return super.equals(obj);
  }
}


