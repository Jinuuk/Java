package com.kh.dic;

import java.util.Comparator;
import java.util.TreeMap;

public class Test {
  public static void main(String[] args) {
    TreeMap<Integer, String> treeMap = new TreeMap<>(new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return 0;
      }
    });

    treeMap.put(1,"학생");
    treeMap.put(2,"선생");
    treeMap.put(3,"교실");
    treeMap.put(4,"영리한");
    treeMap.put(5,"점심");

    System.out.println(treeMap);



  }
}
