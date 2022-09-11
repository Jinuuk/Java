public class Exercise4_4 {
    public static void main(String[] args) {

        // 다음 for문과 동일한 기능을 수행하는 while문을 작성하시오.
        for (int i = 10; i > 0; i -= 2) {
            System.out.println(i);
        }

        int j = 10;
        while (j > 0) {
            System.out.println(j);
            j -= 2;
        }
    }
}
