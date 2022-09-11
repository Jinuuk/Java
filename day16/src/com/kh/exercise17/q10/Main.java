package com.kh.exercise17.q10;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
  public static void main(String[] args) {
    Queue<String> queue = new LinkedList<>();

    queue.offer("땡큐");
    queue.offer("베리");
    queue.offer("감사");
    //3.감사 -> 2.베리 -> 1.땡큐
    queue.poll();
    //2.감사 -> 1.베리
    queue.offer("방가");
    //3.방가 -> 2.감사 -> 1.베리


    System.out.println(queue.peek()); //방가(x) -> 베리
    System.out.println(queue.poll()); //방가(x) -> 베리
    System.out.println(queue.poll()); //베리(x) -> 감사
    System.out.println(queue.poll()); //땡큐(x) -> 방가

  }
}
