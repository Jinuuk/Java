import java.util.Scanner;

public class Account {

    private String name; // 예금주 이름

    private int balance = 0; // 잔고

    private String accountId; // 계좌번호

    private static int count; // 계좌번호 카운트용

    private final int ACCOUNT_SIZE = 3;

    public Account (String name) {
        this.name = name;
        count = getCount() + 1;
        String tmp = count + "";
        int length = ACCOUNT_SIZE - tmp.length();
        for (int i = 0; i < length; i++) {
            tmp = "0" + tmp;
        }
        accountId = tmp;
    }

    //입금
    public void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입금하실 금액을 입력하세요 >> ");
        int money = Integer.parseInt(scanner.nextLine());
        while (money > 40000) {
            System.out.println("1회 입금액은 4만원을 넘을 수 없습니다.");
            System.out.print("입금하실 금액을 입력하세요 >> ");
            money = Integer.parseInt(scanner.nextLine());
            }
        this.balance += money;
        if (this.balance > 100000) {
            System.out.println("예치금액은 10만원 이하로 제한합니다.");
            this.balance -= money;
        }
    }

    //출금
    public void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("출금하실 금액을 입력하세요 >> ");
        int money = Integer.parseInt(scanner.nextLine());
        while (money > 40000) {
            System.out.println("1회 출금액은 4만원을 넘을 수 없습니다.");
            System.out.print("출금하실 금액을 입력하세요 >> ");
            money = Integer.parseInt(scanner.nextLine());
        }
        this.balance -= money;
        if (this.balance < 0) {
            System.out.println("마이너스 잔고는 허용하지 않습니다.");
            this.balance += money;
        }
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountId() {
        return accountId;
    }


    public int getCount() {
        return count;
    }

    //개별 조회
    public String toStringIndividual() {
        return "계좌 조회 결과 >> 이름 : "+this.getName()+", 잔고 : "+this.getBalance();
    }


    public String toStringEntire() {
        return "[이름 : "+this.getName()+", 잔액 :"+this.getBalance()+", 계좌번호 : "+this.getAccountId()+"]";
    }



}
