import java.util.Arrays;
/*
    로또 프로그램 구현하기
    : 1~45 번호 중 중복되지 않는 6자리 추출하기
    Math.random() : 0이상 1미만의 랜덤한 실수 발생
 */
public class RandomExam {
    public static void main(String[] args) {
        while (true) {
            int[] lotto = new int[6];
            for (int i = 0; i < lotto.length; i++) {
                int num = (int) (Math.floor(Math.random() * 45) + 1);
                lotto[i] = num;
            }
            if (lotto[0] == lotto[1] || lotto[0] == lotto[2] || lotto[0] == lotto[3] || lotto[0] == lotto[4] || lotto[0] == lotto[5] || lotto[1] == lotto[2] || lotto[1] == lotto[3] || lotto[1] == lotto[4] || lotto[1] == lotto[5] || lotto[2] == lotto[3] || lotto[2] == lotto[4] || lotto[2] == lotto[5] || lotto[3] == lotto[4] || lotto[3] == lotto[5] || lotto[4] == lotto[5]) {
                continue;
            } else {
                System.out.println(Arrays.toString(lotto));
                break;
            }
        }
    }
}
