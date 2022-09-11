package com.kh.dic;

import java.util.Comparator;
import java.util.Scanner;

public class DictionaryMain {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    Dictionary dictionary = new Dictionary();
    boolean stop = false;

    while (!stop) {
      System.out.println("[메뉴] 1.저장 | 2.검색 | 3.수정 | 4.삭제 | 5.목록 | 6.색인 | 7.통계 | 8.종료 |");
      System.out.print("메뉴 선택 >> ");
      String menu = scanner.nextLine();
      switch (menu) {
        case "1": //저장
          try {
            dictionary.register();
          } catch (Exception e) {
            System.out.println(e.getMessage());
          }
          break;
        case "2": //검색
          dictionary.search();
          break;
        case "3": //수정
          dictionary.modify();
          break;
        case "4": //삭제
          dictionary.delete();
          break;
        case "5": //목록
          dictionary.list();
          break;
        case "6": //색인
          try {
            dictionary.index();
          } catch (Exception e) {
            System.out.println("알파벳 한 글자를 입력해주세요.");
          }
          break;
        case "7": //통계
          dictionary.statistics();
          break;
        case "8": //종료
          System.out.println("단어장 프로그램을 종료합니다.");
          stop = true;
          continue;
        default:
          System.out.println("1~8번 사이의 번호를 입력해주세요.");
      }
    }
  }
}
