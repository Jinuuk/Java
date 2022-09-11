public class AccountMainPractice {
    public static void main(String[] args) {
        AccountPractice account1 = new AccountPractice("김땡땡",100000000);
        System.out.println(account1.toString());

        account1.changeName("이땡땡");
        account1.changebalance(50000000);
        System.out.println(account1.toString());

        account1.deposit(7000000);
        System.out.println(account1.toString());

        account1.withdraw(5000000);
        System.out.println(account1.toString());
    }
}
