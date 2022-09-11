package com.kh.exam1;

import java.util.Scanner;

public class Exam1Main2 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator("빨강");
        Calculator c2 = new Calculator("빨강", "모닝글로리");

        //켜다 또는 끄다
        c1.powerOff();

        try {
            System.out.println(c1.getResult());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("값1 : ");
//        String input1 = scanner.nextLine();
//        double value1 = Double.parseDouble(input1);
        double value1 = Double.parseDouble(scanner.nextLine());

        System.out.print("값2 : ");
//        String input2 = scanner.nextLine();
//        double value2 = Double.parseDouble(input2);
        double value2 = Double.parseDouble(scanner.nextLine());


        c1.plus(value1, value2);
        try {
            System.out.println(c1.getResult());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

//        scanner.nextLine();
//        double input1 = Double.parseDouble(scanner.nextLine());
//        double input2 = Double.parseDouble(scanner.nextLine());
//
//        c1.plus(input1, input2);
//        System.out.println(c1.result);
    }
}
