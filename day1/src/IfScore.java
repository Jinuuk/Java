public class IfScore {
    public static void main(String[] args) {
        int score;

        score = 20;

        if(score <= 100 && score >= 90){

        }else if(score <= 100 && score >= 90){
            System.out.println("A학점");
        }else if(score <= 89 && score >= 80){
            System.out.println("B학점");
        }else if(score <= 79 && score >= 69){
            System.out.println("C학점");
        }else if(score <= 69 && score >= 60){
            System.out.println("D학점");
        }else{
            System.out.println("F학점");
        }
    }
}
