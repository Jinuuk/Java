public class HackJum2 {
    public static void main(String[] args) {

        int 국어 = 82;
        int 영어 = 73;
        int 수학 = 65;

        int sum = 0; // 지역변수를 선언할 때 초기화를 바로 해놓으면 코드가 길어질 때 오류가 날 경우가 줄어든다.
        double average = 0.0; //

        sum = total(국어,영어,수학);
        average = getAverage(sum, 3);

        System.out.println("총점 : "+sum);
        System.out.println("평균 : "+average);

        //System.out.println(total(1, 2, 3));
        //System.out.println(getAverage(100,10));

    }
    //3과목의 합계
    public static int total(int 국어, int 영어, int 수학) {
        //return 국어 + 영어 + 수학;
        int result = 국어 + 영어 + 수학;
        return result;
    }
    //평균 구하기
    public static double getAverage(int total, int count) {
      return total/(double)count;
    }

// 나
//    public static void main(String[] args) {
//
//        int 국어 = 100;
//        int 영어 = 90;
//        int 수학 = 80;
//
//        sum(국어, 영어, 수학);
//        average(국어, 영어, 수학);
//    }
//
//    public static void sum(int 국어, int 영어, int 수학) {
//        System.out.println("총점 : "+(국어+영어+수학));
//    }
//
//    public static void average(int 국어, int 영어, int 수학) {
//        System.out.println("평균 : "+(국어+영어+수학)/3);
//    }
}
