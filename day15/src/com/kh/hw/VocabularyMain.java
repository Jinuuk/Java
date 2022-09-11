package com.kh.hw;

import java.util.Scanner;

public class VocabularyMain {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Vocabulary vocabulary = new Vocabulary();
    boolean stop = false;
    String menu;

    while (!stop) {
      System.out.println("[메뉴] 1.등록 2.검색 3.수정 4.삭제 5.목록 6.종료");
      System.out.print("메뉴 선택 >> ");
      menu = scanner.nextLine();

      switch (menu) {
        case "1": //등록
          try {
            vocabulary.register();
          } catch (Exception e) {
            System.out.println(e.getMessage());
          }
          break;
        case "2": //검색
          try {
            vocabulary.search();
          } catch (Exception e) {
            System.out.println(e.getMessage());
          }
          break;
        case "3": //수정
          try {
            vocabulary.modify();
          } catch (Exception e) {
            System.out.println(e.getMessage());
          }
          break;
        case "4": //삭제
          try {
            vocabulary.delete();
          } catch (Exception e) {
            System.out.println(e.getMessage());
          }
          break;
        case "5": //목록
          vocabulary.list();
          break;
        case "6": //종료
          System.out.println("단어장 프로그램을 종료합니다.");
          stop = true;
          continue;
        default:
          System.out.println("1~6번 사이의 번호를 입력하세요.");
      }
    }
  }
}
