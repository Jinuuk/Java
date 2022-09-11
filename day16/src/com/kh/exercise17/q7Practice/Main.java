package com.kh.exercise17.q7Practice;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    MyData md1 = new MyData(1);
    MyData md2 = new MyData(3);
    MyData md3 = new MyData(4);
    MyData md4 = new MyData(2);

    Set<MyData> set = new HashSet<>();
    set.add(md1);
    set.add(md2);
    set.add(md3);
    set.add(md4);
    System.out.println(set);




  }
}
