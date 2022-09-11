package com.kh.exam3;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        long money = 0;
        Account account = null;

        do {
            //메뉴출력
            System.out.println("[1.계좌 개설 2.입금 3.출금 4.잔액조회 5.종료]");
            System.out.print(">> ");
            String menuValue = scanner.nextLine();

            switch (menuValue) {
                case "1": //계좌 개설
                    System.out.println("이름을 입력하세요");
                    System.out.print(">> ");
                    String name = scanner.nextLine();
                    account = new Account(name);
                    System.out.println(name + "님의 계좌가 개설되었습니다.");
                    break;

                case "2": //입금
                    if (account == null) {
                        System.out.println("먼저 계좌를 개설해주세요");
                        continue; //왜 break해도 무한 반복? if문을 제외하고 가장 가까운 조건문 탈출. 이 경우 switch문
                    }
                    System.out.println("입금하실 금액을 입력하세요");
                    System.out.print(">> ");
                    money = Long.parseLong(scanner.nextLine());
                    if (money <= 100000) {
                        account.deposit(money);
                        System.out.println(money + "원을 입금했습니다.");
                        break;
                    } else {
                        System.out.println("1회 입금한도는 10만원을 넘지 못합니다.");
                        break;
                    }

                case "3": //출금
                    if (account == null) {
                        System.out.println("먼저 계좌를 개설해주세요");
                        break; //왜 break해도 무한 반복? if문을 제외하고 가장 가까운 조건문 탈출. 이 경우 switch문
                    }

                    System.out.println("출금하실 금액을 입력하세요");
                    System.out.print(">> ");
                    money = Long.parseLong(scanner.nextLine());
                    account.withdraw(money);
                    if (account.getBalance() < -1000000) {
                        System.out.println("마이너스 잔액한도는 100만원까지 입니다.");
                        account.deposit(money);
                        break;
                    } else {
                        System.out.println(money + "원을 출금했습니다.");
                        break;
                    }

                case "4": //잔액조회
                    if (account == null) {
                        System.out.println("먼저 계좌를 개설해주세요");
                        break; //왜 break해도 무한 반복? if문을 제외하고 가장 가까운 조건문 탈출. 이 경우 switch문
                    }

                    long blance = account.getBalance();
                    System.out.println(account.getAccountOwner() + "님의 잔액 : " + blance);
                    break;

                case "5": //종료
                    System.out.println("종료합니다.");
                    stop = true;
                    break;

                default:
                    System.out.println("1~6번을 입력하세요");
                    break;
            }
        } while (!stop);
    }
}
