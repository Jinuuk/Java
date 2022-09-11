public class DicePractice {
    int diceResult;

    public void run() {
        this.diceResult = (int) Math.floor(Math.random() * 6 + 1);
    }

    public static void compare(int diceResult1, int diceResult2) {
        if (diceResult1 + diceResult2 > 10) {
            System.out.println("당첨!");
        } else {
            System.out.println("꽝!");
        }
    }
}
