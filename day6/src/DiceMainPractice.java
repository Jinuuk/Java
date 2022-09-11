public class DiceMainPractice {
    public static void main(String[] args) {

        DicePractice dice1 = new DicePractice();
        DicePractice dice2 = new DicePractice();

        dice1.run();
        int input1 = dice1.diceResult;
        System.out.println("주사위1의 결과 : " + dice1.diceResult);

        dice2.run();
        int input2 = dice2.diceResult;
        System.out.println("주사위2의 결과 : " + dice2.diceResult);

        DicePractice.compare(input1, input2);

    }
}
