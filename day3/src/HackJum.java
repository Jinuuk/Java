public class HackJum {
    public static void main(String[] args) {

        int 국어 = 82;
        int 영어 = 73;
        int 수학 = 65;

        int sum = 0; // 지역변수를 선언할 때 초기화를 바로 해놓으면 코드가 길어질 때 오류가 날 경우가 줄어든다.
        double average = 0.0; //

        sum = 국어 + 영어 + 수학;

        //case1)
        //average = (double)sum/3;

        //case2)
        //average = sum/(double)3;

        //case2)
        average = sum/(3*1.0);
        System.out.println("총점 : "+sum);
        System.out.println("평균 : "+average);


// 나
//  public static void main(String[] args){
//        int 국어 = 82;
//        int 영어 = 73;
//        int 수학 = 65;
//
//        System.out.println("총점 : "+(국어+영어+수학));
//        System.out.println("평균 : "+(국어+영어+수학)/3)
//  }

    }
}
