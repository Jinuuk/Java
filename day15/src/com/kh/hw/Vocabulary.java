package com.kh.hw;

import java.util.*;

public class Vocabulary {
  private Map<String, String> vocabulary = new HashMap<>();
  private Scanner scanner = new Scanner(System.in);
  private String word; //단어
  private String meaning; //뜻

  //등록
  public void register(){
    System.out.println("등록할 단어와 뜻을 입력하세요.");
    System.out.print("단어 >> ");
    word = scanner.nextLine();
    if (vocabulary.containsKey(word)) {
      throw new NonExistWordException("해당하는 단어가 이미 존재합니다.");
    }
    System.out.print("뜻 >> ");
    meaning = scanner.nextLine();
    vocabulary.put(word, meaning);
    System.out.println("단어가 등록되었습니다.");
    System.out.println(word + " : " + vocabulary.get(word));
  }

  //검색
  public void search() {
    System.out.print("검색할 단어를 입력하세요 >> ");
    word = scanner.nextLine();
    if (!(vocabulary.containsKey(word))) {
      throw new NonExistWordException("해당하는 단어를 찾을 수 없습니다.");
    }
    System.out.println(word + " : " + vocabulary.get(word));
  }

  //수정
  public void modify() {
    System.out.print("뜻을 수정할 단어를 입력하세요 >> ");
    word = scanner.nextLine();
    if (!(vocabulary.containsKey(word))) {
      throw new NonExistWordException("해당하는 단어를 찾을 수 없습니다.");
    }
    System.out.print("뜻을 입력하세요 >> ");
    meaning = scanner.nextLine();
    vocabulary.replace(word, meaning);
    System.out.println("수정이 완료되었습니다.");
    System.out.println(word + " : " + vocabulary.get(word));
  }

  //삭제
  public void delete() {
    System.out.print("삭제할 단어를 입력하세요 >> ");
    word = scanner.nextLine();
    if (!(vocabulary.containsKey(word))) {
      throw new NonExistWordException("해당하는 단어를 찾을 수 없습니다.");
    }
    vocabulary.remove(word);
    System.out.println("삭제가 완료되었습니다.");
  }

  //목록
  public void list() {
    Set<Map.Entry<String, String>> entries = vocabulary.entrySet();
    System.out.println("=========================");
    for (Map.Entry<String, String> ele :
        entries) {
      System.out.println(ele.getKey() + " : " + ele.getValue());
    }
    System.out.println("=========================");
  }
}
