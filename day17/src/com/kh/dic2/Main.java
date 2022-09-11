package com.kh.dic2;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    TreeMap<String,String> map = new TreeMap<>();

    map.put("student","학생");
    map.put("teacher","선생");
    map.put("classroom","교실");
    map.put("smart","영리한");
    map.put("lunch","점심");

    String inputWord = "sm";



    char firstLetter = inputWord.charAt(0);
    System.out.println(firstLetter);
    char nextLetter = (char)(inputWord.charAt(0) + 1);
//    char nextLetter = (char) (firstLetter + 1);
//    System.out.println(nextLetter);

    NavigableMap<String, String> subMap = map.subMap("sm", true, "sn", false);
    System.out.println(subMap);

  }
}
