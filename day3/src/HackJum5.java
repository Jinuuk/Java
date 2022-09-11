import java.util.Scanner;

public class HackJum5 {
    public static void main(String[] args) {

        boolean stop = false;

        System.out.println("<< 3개의 과목을 입력받아 총점/평균 구하는 프로그램 >>");

        while (!stop) {
            int 국어 = inputValue("국어");
            if (국어 == -1) {
                stop = true;
                continue;
            }

            int 영어 = inputValue("영어");
            if (영어 == -1) {
                stop = true;
                continue;
            }

            int 수학 = inputValue("수학");
            if (수학 == -1) {
                stop = true;
                continue;
            }

            int sum = 0; // 지역변수를 선언할 때 초기화를 바로 해놓으면 코드가 길어질 때 오류가 날 경우가 줄어든다.
            double average = 0.0; //

            sum = total(국어, 영어, 수학);
            average = getAverage(sum, 3);

            System.out.println("총점 : " + sum);
            System.out.println("평균 : " + average);
            break;
        }
    }

    public static int inputValue(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(title + " 점수 >> ");
        String input = scanner.nextLine();

        int score;
        if (input.equals("Q") || input.equals("q")) {
            score = -1;
        } else {
            score = Integer.parseInt(input);
        }
        return score;
    }

    //3과목의 합계
    public static int total(int 국어, int 영어, int 수학) {
        //return 국어 + 영어 + 수학;
        int result = 국어 + 영어 + 수학;
        return result;
    }
    //평균 구하기
    public static double getAverage(int total, int count) {
        return total / (double) count;
    }
}

/*
{
        boolean stop = false;

        System.out.println("<< 3개의 과목을 입력받아 총점/평균 구하는 프로그램 >>");

        System.out.print("[Q] 또는 [q]를 입력하면 종료됩니다 >> ");

        while (!stop) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equals("Q") || input.equals("q")) {
                stop = true;
                continue;
            }

            int 국어 = inputValue("국어");
            int 영어 = inputValue("영어");
            int 수학 = inputValue("수학");

            int sum = 0; // 지역변수를 선언할 때 초기화를 바로 해놓으면 코드가 길어질 때 오류가 날 경우가 줄어든다.
            double average = 0.0; //

            sum = total(국어, 영어, 수학);
            average = getAverage(sum, 3);

            System.out.println("총점 : " + sum);
            System.out.println("평균 : " + average);
            break;
        }
    }
 */

