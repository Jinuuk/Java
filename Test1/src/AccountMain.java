import java.util.Arrays;
import java.util.Scanner;

public class AccountMain {

    public static void main(String[] args) {

        Account[] account = new Account[5];
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;

        do {
            System.out.println("[메뉴] 1.신규 계좌 개설 2.폐지 3.입금 4.출금 5.개별 계좌 조회 6.전체 계좌 조회 7.종료");
            System.out.print(">> ");
            int menu = Integer.parseInt(scanner.nextLine());

            switch (menu) {
                case 1 : //신규 계좌 개설
                    System.out.print("계좌를 개설하시려면 성함을 입력하세요 >> ");
                    String name = scanner.nextLine();
                    boolean flag = false;
                    int i;
                    for (i = 0; i < account.length; i++) {
                        if (account[i] == null) {
                            account[i] = new Account(name);
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        System.out.println("계좌를 개설할 수 없습니다.");
                    } else {
                        System.out.println(account[i].getName()+"님의 계좌가 개설되었습니다.");
                        System.out.println(account[i].getName()+"님의 계좌 번호는 "+account[i].getAccountId()+"입니다.");
                    }
                    break;

                case 2 : //폐지
                    System.out.print("폐지할 계좌의 계좌번호를 입력하세요 >> ");
                    String selectAccountId0 = scanner.nextLine();
                    boolean flag0 = false;
                    int j;
                    for (j = 0; j < account.length ; j++) {
                        if (account[j] != null && account[j].getAccountId().equals(selectAccountId0) && account[j].getBalance() == 0) {
                            account[j] = null;
                            flag0 = true;
                            break;
                        }
                    }
                    if (!flag0) {
                        System.out.println("해당하는 계좌를 찾을 수 없거나 잔액이 있어서 폐지가 불가능합니다.");
                        continue;
                    } else {
                        System.out.println("계좌가 폐지되었습니다.");
                    }
                    break;

                case 3 : //입금
                    System.out.print("입금할 계좌의 계좌번호를 입력하세요 >> ");
                    String selectAccountId1 = scanner.nextLine();
                    boolean flag2 = false;
                    for (int k = 0; k < account.length ; k++) {
                        if (account[k] != null && account[k].getAccountId().equals(selectAccountId1)) {
                            account[k].deposit();
                            flag2 = true;
                            break;
                        }
                    }
                    if (!flag2) {
                        System.out.println("해당하는 계좌를 찾을 수 없습니다.");
                        continue;
                    }
                    break;

                case 4 : //출금
                    System.out.print("출금할 계좌의 계좌번호를 입력하세요 >> ");
                    String selectAccountId2 = scanner.nextLine();
                    boolean flag3 = false;
                    for (int k = 0; k < account.length ; k++) {
                        if (account[k] != null && account[k].getAccountId().equals(selectAccountId2)) {
                            account[k].withdraw();
                            flag3 = true;
                            break;
                        }
                    }
                    if (!flag3) {
                        System.out.println("해당하는 계좌를 찾을 수 없습니다.");
                        continue;
                    }
                    break;

                case 5 : // 개별 조회
                    System.out.print("조회할 계좌의 계좌번호를 입력하세요 >> ");
                    String selectAccountId3 = scanner.nextLine();
                    boolean flag4 = false;
                    for (int k = 0; k < account.length ; k++) {
                        if (account[k] != null && account[k].getAccountId().equals(selectAccountId3)) {
                            System.out.println(account[k].toStringIndividual());
                            flag4 = true;
                            break;
                        }
                    }
                    if (!flag4) {
                        System.out.println("해당하는 계좌를 찾을 수 없습니다.");
                        continue;
                    }
                    break;

                case 6 : // 전체 조회

                    break;
                case 7 : //종료
                    System.out.println("종료합니다.");
                    stop = true;
                    continue;
                default:
                    System.out.println("1~7사이의 번호를 입력하세요");
                    break;
            }
       } while (!stop);
    }
}
