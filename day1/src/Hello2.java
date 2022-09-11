/*
   소스파일 : Hello2.java
   중간코드 : Hello2.class
   작성자 : 홍길동
   작성일 : 2022.05.10
 */
public class Hello2 {
    //두 개 변수의 합 구하기
    public static void main(String[] args){
        int x = 10;
        int y = 20;
        int sum = x / y; //산술연산자 : +,-,*,/
        System.out.println(sum);

        double result = devide(30, 5);
        System.out.println("메인 메소드에서 출력 : "+result);

        double result2 = devide(100,10);
        System.out.println("메인 메소드에서 출력 : "+result2);
    }

    public static double devide(double x, double y){
        //System.out.println(x/y);
        double result = x / y;

        return result;
    }
}
