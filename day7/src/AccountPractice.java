public class AccountPractice {
    private String name; // 예금주 이름
    private int balance; //잔고


    public AccountPractice(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    //예금주 이름을 주어진 값으로 변경한다
    public void changeName(String changedName) {
        this.name = changedName;
    }

    //잔고를 주어진 값으로 변경한다
    public void changebalance(int changedBalance) {
        this.balance = changedBalance;
    }

    //예금주 이름을 알려준다
    public String showName() {
        return this.name;
    }

    //잔고를 알려준다
    public int showBalance() {
        return this.balance;
    }

    //주어진 금액을 입금한다
    public int deposit(int money) { //반환값 필요?
        this.balance += money;
        return this.balance;
    }

    //주어진 금액을 출금한다
    public int withdraw(int money) { //반환값 필요?, 마이너스 통장이 안되게 수정
        this.balance -= money;
        return this.balance;
    }

    //예금 계좌의 모든 데이터 값을 알려준다
    @Override
    public String toString() {
        return name+"의 계좌 {" +
                "이름 : " + name  +
                ", 잔고 : " + balance +
                "원}";
    }
}
