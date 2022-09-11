package com.kh.dic;

import java.util.*;

public class Dictionary {

  private TreeMap<String, String> treeMap;

  public Dictionary() {
    treeMap = new TreeMap<String, String>();
  }

  private Scanner scanner = new Scanner(System.in);
  private String englishWord; //영어 단어
  private String koreanMeaning; //한글 뜻

  @Override
  public String toString() {
    return "Dictionary{" +
        "treeMap=" + treeMap +
        '}';
  }

  //1.저장
  public void register() {
    if (treeMap.size() >= 5) {
      System.out.println("최대 5개 단어만 저장할 수 있습니다.");
      return;
    }
    System.out.println("저장할 단어를 입력하세요.");
    System.out.print("단어 >> ");
    englishWord = scanner.nextLine();
    if (treeMap.containsKey(englishWord.trim().toLowerCase())) {
      throw new DictionaryException("이미 등록되었습니다.");
    }
    System.out.print("뜻 >> ");
    koreanMeaning = scanner.nextLine();
    treeMap.put(englishWord.trim().toLowerCase(), koreanMeaning.trim().toLowerCase());
    System.out.println("저장이 완료되었습니다.");
  }

  //2.검색
  public void search() {
    System.out.print("검색할 단어를 입력하세요 >> ");
    englishWord = scanner.nextLine();
    if (!treeMap.containsKey(englishWord.trim().toLowerCase())) {
      System.out.println("단어를 검색할 수 없습니다.");
      return;
    }
    System.out.println("검색 결과 >> " + englishWord.trim().toLowerCase() + " : " + treeMap.get(englishWord.trim().toLowerCase()));
    //단어 일부 검색 추가
  }

  //3.수정
  public void modify() {
    System.out.print("수정할 단어를 입력하세요 >> ");
    englishWord = scanner.nextLine();
    if (!treeMap.containsKey(englishWord.trim().toLowerCase())) {
      System.out.println("단어를 검색할 수 없습니다.");
      return;
    }
    System.out.print("뜻을 입력하세요 >> ");
    koreanMeaning = scanner.nextLine();
    treeMap.replace(englishWord.trim().toLowerCase(), koreanMeaning.trim().toLowerCase());
    System.out.println("단어의 뜻을 수정하였습니다.");
  }

  //4.삭제
  public void delete() {
    System.out.print("삭제할 단어를 입력하세요 >> ");
    englishWord = scanner.nextLine();
    if (!treeMap.containsKey(englishWord.trim().toLowerCase())) {
      System.out.println("단어를 검색할 수 없습니다.");
      return;
    }
    treeMap.remove(englishWord.trim().toLowerCase());
    System.out.println("단어를 삭제하였습니다.");
  }

  //5.목록
  public void list() {
    System.out.println("[서브메뉴] 1.오름차순 2.내림차순");
    System.out.print("서브메뉴 선택 >> ");
    String listMenu = scanner.nextLine();
    switch (listMenu) {
      case "1":
        Set<Map.Entry<String, String>> set1 = treeMap.entrySet();
        for (Map.Entry<String, String> ele1 : set1
        ) {
          System.out.println(ele1.getKey() + " : " + ele1.getValue());
        }
        break;
      case "2":
        Set<Map.Entry<String, String>> set2 = treeMap.descendingMap().entrySet();
        for (Map.Entry<String, String> ele2 : set2
        ) {
          System.out.println(ele2.getKey() + " : " + ele2.getValue());
        }
        break;
      default:
        System.out.println("1~2번 사이의 번호를 입력해주세요");
    }
  }

  //6.색인
  public void index() {
    String alphabet = "abcdefghijklmnopqrstuvwxyz!";
    System.out.print("색인으로 검색할 알파벳 한 글자를 입력해주세요 >> ");
    String firstLetter = scanner.nextLine();
    int firstLetterNum = alphabet.indexOf(firstLetter.toLowerCase());
    String nextLetter = alphabet.charAt(firstLetterNum + 1) + "";
    NavigableMap<String, String> map = treeMap.subMap(firstLetter, true, nextLetter, false);
    System.out.println(map);
  }

  //7.통계
  public void statistics() {
    System.out.println("===================================");

    System.out.println("저장된 단어 개수 : " + treeMap.size());
    System.out.println("=======단어 글자수 내림차순 출력=======");
    //단어 글자수 내림차순 출력(단어만)
    TreeMap<String, String> treeMap2 = new TreeMap<>(new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        Integer o1length = o1.length();
        Integer o2length = o2.length();
        return o1length.compareTo(o2length) * -1;
      }
    });
    Set<Map.Entry<String, String>> set = treeMap.entrySet();
    for (Map.Entry<String, String> ele : set
    ) {
      treeMap2.put(ele.getKey(), ele.getValue());
    }
    Set<Map.Entry<String, String>> set3 = treeMap2.entrySet();
    for (Map.Entry<String, String> ele : set3
    ) {
      System.out.println(ele.getKey());
    }
    System.out.println("===================================");
    //단어의 문자수가 가장 많은 단어
    System.out.println("단어의 문자수가 가장 많은 단어 : "+treeMap2.firstKey());
    System.out.println("===================================");

  }
}
