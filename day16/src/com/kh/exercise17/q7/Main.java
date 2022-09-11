package com.kh.exercise17.q7;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    System.out.println(">> 문자열 길이 오름차순 정렬 (Comparable) <<");
    MyData md1 = new MyData("자바 프로그램");
    MyData md2 = new MyData("반가워");
    MyData md3 = new MyData("감사합니다");
    TreeSet<MyData> treeSet = new TreeSet<>();
    treeSet.add(md1);
    treeSet.add(md2);
    treeSet.add(md3);
    System.out.println(treeSet);
    System.out.println();

    System.out.println(">> 문자열 길이 오름차순 정렬 (이름 있는) <<");
    TreeSet<MyData> treeSet2 = new TreeSet<>(new AscendingByLengthOfString());
    treeSet2.add(md1);
    treeSet2.add(md2);
    treeSet2.add(md3);
    System.out.println(treeSet2);
    System.out.println();

    System.out.println(">> 문자열 길이 오름차순 정렬 (이름 없는) <<");
    TreeSet<MyData> treeSet3 = new TreeSet<>(new Comparator<MyData>() {
      @Override
      public int compare(MyData o1, MyData o2) {
        Integer o1StrLength = o1.str.length();
        Integer o2StrLength = o2.str.length();
        return o1StrLength.compareTo(o2StrLength);
      }
    });
    treeSet3.add(md1);
    treeSet3.add(md2);
    treeSet3.add(md3);
    System.out.println(treeSet3);
    System.out.println();

    System.out.println(">> 문자열 길이 내림차순 정렬 (이름 있는) <<");
    TreeSet<MyData> treeSet6 = new TreeSet<>(new DescendingByLengthOfString());
    treeSet6.add(md1);
    treeSet6.add(md2);
    treeSet6.add(md3);
    System.out.println(treeSet6);
    System.out.println();

    System.out.println(">> 문자열 길이 내림차순 정렬 (이름 없는) <<");
    TreeSet<MyData> treeSet7 = new TreeSet<>(new Comparator<MyData>() {
      @Override
      public int compare(MyData o1, MyData o2) {
        Integer o1StrLength = o1.str.length();
        Integer o2StrLength = o2.str.length();
        return o1StrLength.compareTo(o2StrLength) * -1;
      }
    });
    treeSet7.add(md1);
    treeSet7.add(md2);
    treeSet7.add(md3);
    System.out.println(treeSet7);
    System.out.println();

    System.out.println(">> 글자 기준 내림차순 정렬 (이름 있는) <<");
    TreeSet<MyData> treeSet4 = new TreeSet<>(new DescendingByDic());
    treeSet4.add(md1);
    treeSet4.add(md2);
    treeSet4.add(md3);
    System.out.println(treeSet4);
    System.out.println();

    System.out.println(">> 글자 기준 내림차순 정렬 (이름 없는) <<");
//    TreeSet<MyData> treeSet5 = new TreeSet<>(new Comparator<MyData>() {
//      @Override
//      public int compare(MyData o1, MyData o2) {
//        return o1.str.compareTo(o2.str) * -1;
//      }
//    });

    Comparator comp = new Comparator<MyData>() {
      @Override
      public int compare(MyData o1, MyData o2) {
        return o1.str.compareTo(o2.str) * -1;
      }
    };
    TreeSet<MyData> treeSet5 = new TreeSet<>(comp);

    treeSet5.add(md1);
    treeSet5.add(md2);
    treeSet5.add(md3);
    System.out.println(treeSet5);
    System.out.println();

    System.out.println(">> 글자 기준 오름차순 정렬 (이름 있는) <<");
    TreeSet<MyData> treeSet8 = new TreeSet<>(new AscendingByDic());
    treeSet8.add(md1);
    treeSet8.add(md2);
    treeSet8.add(md3);
    System.out.println(treeSet8);
    System.out.println();

    System.out.println(">> 글자 기준 오름차순 정렬 (이름 없는) <<");
    TreeSet<MyData> treeSet9 = new TreeSet<>(new Comparator<MyData>() {
      @Override
      public int compare(MyData o1, MyData o2) {
        return o1.str.compareTo(o2.str);
      }
    });
    treeSet9.add(md1);
    treeSet9.add(md2);
    treeSet9.add(md3);
    System.out.println(treeSet9);
    System.out.println();
  }
}
