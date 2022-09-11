package comkh.exam1;

import java.util.ArrayList;
import java.util.List;

public class ListExam {
  public static void main(String[] args) {
    //List 계열의 컬렉션 생성
    List<String> list = new ArrayList<String>(2);
    System.out.println(list.size());

    //컬렉션 끝에 요소 추가
    list.add("홍길동");
    list.add("홍길순");
    list.add("홍길북");
    System.out.println(list);

    System.out.println("=============================");
    //요소 순환 (일반 for문)
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

    System.out.println("=============================");
    //요소 순환 (향상된 for문)
    for (String ele :
        list) {
      System.out.println(ele);
    }

    System.out.println("=============================");



    //원하는 인덱스에 요소 추가
    list.add(1,"홍길북");
    System.out.println(list);

    //교체하고자 하는 인덱스에 요소 교체
    list.set(3,"홍길서");
    System.out.println(list);

    //찾고자 하는 요소가 있는지 판단 (요소 검색)
    System.out.println(list.contains("홍길동")); //true

    //특정 인덱스의 요소를 반환 (요소 검색)
    System.out.println(list.get(2)); //홍길순

    //컬렉션이 비어있는지 유무 (요소 검색)
    System.out.println(list.isEmpty()); //false

    //컬렉션에 있는 요소의 개수 반환 (요소 검색)
    System.out.println(list.size()); //4

    //특정 인덱스의 요소 삭제 (요소 삭제)
    list.remove(2);
    System.out.println(list);

    //특정 요소를 삭제 (요소 삭제)
    list.remove("홍길북");
    System.out.println(list);

    //전체 요소 삭제 (요소 삭제)
    list.clear();
    System.out.println(list);





  }
}
