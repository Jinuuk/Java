public class ArrayTest2 {
    public static void main(String[] args) {

        // 디폴트값을 원하는 값으로 초기화해서 배열 생성하기

        int[] subject = new int[]{70, 80, 90}; // **배열선언과 배열 생성 분리 가능, 권장, []안에 숫자 넣으면 오류
//        int[] subject = null; // 배열선언
//        subject = new int[]{70, 80, 90}; // 배열생성
        System.out.println(subject[0]);
        System.out.println(subject[1]);
        System.out.println(subject[2]);



        int[] subject2 = {70, 80, 90}; // **배열선언과 배열생성 분리 불가능
//        int[] subject2 = null;
//        subject2 = {70, 80, 90}; (X)
        System.out.println(subject2[0]);
        System.out.println(subject2[1]);
        System.out.println(subject2[2]);
    }
}
