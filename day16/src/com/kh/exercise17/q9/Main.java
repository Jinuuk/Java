package com.kh.exercise17.q9;

import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Stack<Double> stack = new Stack<>();
    stack.push(1.1);
    stack.push(2.2);
    stack.pop();
    stack.push(3.3);
    stack.push(4.4);

    System.out.println(stack.search(1.1)); //0(x) -> 3
    System.out.println(stack.search(2.2)); //null(x) -> -1
    System.out.println(stack.search(3.3)); //1(x) -> 2
    System.out.println(stack.search(4.4)); //2(x) -> 1
    //제일 위에 있는 것(최근에 넣은 것)이 1

  }
}
