public class SwitchScore {
    public static void main(String[] args) {
        int score;

        score = 67;

        switch (score / 10){
            //A학점
            case 10:
                System.out.println("A학점");
                break;
            case 9:
                System.out.println("A학점");
                break;
            case 8:
                System.out.println("B학점");
                break;
            case 7:
                System.out.println("C학점");
                break;
            case 6:
                System.out.println("D학점");
                break;
            default:
                System.out.println("F학점");
        }
    }
}
