import java.util.Scanner;

public class HackJum3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("<3개의 과목을 입력받아 총점/평균 구하는 프로그램>>");
        System.out.print("국어 점수 >> ");
        String input1 = scanner.nextLine();
        int 국어 = Integer.parseInt(input1);

        System.out.print("영어 점수 >> ");
        String input2 = scanner.nextLine();
        int 영어 = Integer.parseInt(input2);

        System.out.print("수학 점수 >> ");
        String input3 = scanner.nextLine();
        int 수학 = Integer.parseInt(input3);

        int sum = 0; // 지역변수를 선언할 때 초기화를 바로 해놓으면 코드가 길어질 때 오류가 날 경우가 줄어든다.
        double average = 0.0; //

        sum = total(국어, 영어, 수학);
        average = getAverage(sum, 3);

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + average);
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

// 나
//        public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("<<총점과 평균 구하기>>");
//
//        System.out.print("국어 점수를 입력하세요 : ");
//        int 국어 =  Integer.parseInt(scanner.nextLine());
//        System.out.print("영어 점수를 입력하세요 : ");
//        int 영어 =  Integer.parseInt(scanner.nextLine());
//        System.out.print("수학 점수를 입력하세요 : ");
//        int 수학 =  Integer.parseInt(scanner.nextLine());
//
//        int sum = 0; // 지역변수를 선언할 때 초기화를 바로 해놓으면 코드가 길어질 때 오류가 날 경우가 줄어든다.
//        double average = 0.0; //
//
//        sum = total(국어,영어,수학);
//        average = getAverage(sum, 3);
//
//        System.out.println("총점 : "+sum);
//        System.out.println("평균 : "+average);
//
//    }
//        //3과목의 합계
//        public static int total(int 국어, int 영어, int 수학) {
//        //return 국어 + 영어 + 수학;
//        int result = 국어 + 영어 + 수학;
//        return result;
//    }
//        //평균 구하기
//        public static double getAverage(int total, int count) {
//        return total/(double)count;
//    }

// 나
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("<<총점과 평균 구하기>>");
//        System.out.print("국어 점수를 입력하세요 : ");
//        int 국어 =  Integer.parseInt(scanner.nextLine());
//        System.out.print("영어 점수를 입력하세요 : ");
//        int 영어 =  Integer.parseInt(scanner.nextLine());
//        System.out.print("수학 점수를 입력하세요 : ");
//        int 수학 =  Integer.parseInt(scanner.nextLine());
//
//        sum(국어, 영어, 수학);
//        average(국어, 영어, 수학);
//    }
//
//    public static void sum(int 국어, int 영어, int 수학) {
//
//        System.out.println("총점 : "+(국어+영어+수학));
//    }
//
//    public static void average(int 국어, int 영어, int 수학) {
//
//        System.out.println("평균 : "+(국어+영어+수학)/3);
//    }

