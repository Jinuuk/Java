package com.kh.exam4;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PersonMain {
  public static void main(String[] args) {
    Person p1 = new Person("홍길동1", 20);
    Person p2 = new Person("홍길동2", 40);
    Person p3 = new Person("홍길동3", 30);
    Person p4 = new Person("홍길동4", 10);

    TreeSet<Person> set = new TreeSet<>();

    set.add(p1);
    set.add(p2);
    set.add(p3);
    set.add(p4);

    System.out.println(set);

    //방법 2 : TreeSet, TreeMap 생성시 Comparator 구현 객체 이용
    Set<Person> set2 = new TreeSet<>(new Comparator<Person>() { //익명 객체
      @Override
      public int compare(Person o1, Person o2) {
        int result = 0;
        if (o1.getAge() < o2.getAge()) {
          result = 1;
        } else if (o1.getAge() > o2.getAge()) {
          result = -1;
        }
        return result;
      }
    });

//    Comparator comp1 = new Comparator<Person>() {
//      @Override
//      public int compare(Person o1, Person o2) {
//        int result = 0;
//        if (o1.getAge() < o2.getAge()) {
//          result = 1;
//        } else if (o1.getAge() > o2.getAge()) {
//          result = -1;
//        }
//        return result;
//      }
//    };
//    Set<Person> set2 = new TreeSet<>(comp1);

    set2.add(p1);
    set2.add(p2);
    set2.add(p3);
    set2.add(p4);
    System.out.println(set2);

//    String s1 = "20";
//    String s2 = "40";
//    String s3 = "50";
//    String s4 = "10";
//    Set<String> set2 = new TreeSet<>();
//    set2.add(s1);
//    set2.add(s2);
//    set2.add(s3);
//    set2.add(s4);
//    System.out.println(set2);
  }
}
