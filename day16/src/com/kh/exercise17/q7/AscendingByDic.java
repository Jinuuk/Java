package com.kh.exercise17.q7;

import java.util.Comparator;

public class AscendingByDic implements Comparator<MyData> {
  //글자 기준 오름차순 정렬
  @Override
  public int compare(MyData o1, MyData o2) {
    return o1.str.compareTo(o2.str);
  }
}
