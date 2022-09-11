package com.kh.exercise17.q7;

import java.util.Comparator;

public class AscendingByLengthOfString implements Comparator<MyData> {
  //문자열 길이 오름차순 정렬
  @Override
  public int compare(MyData o1, MyData o2) {
    Integer o1StrLength = o1.str.length();
    Integer o2StrLength = o2.str.length();
    return o1StrLength.compareTo(o2StrLength);
  }
}
