import java.util.Arrays;

public class RandomExam4 {
    public static void main(String[] args) {
        int[] lotto = new int[6];

        int count = 0; // for문 반복 횟수 카운트

        //for문을 while문으로 수정하기
        int i = 0;
         do{
            int num = (int) (Math.floor(Math.random() * 45) + 1);
            count++; // count = count + 1, count += 1;

            // 동일 번호가 존재하면
            if (isExist(lotto, num)) {
                i--;
                continue;
            }
//            lotto[i] = num;
//            i++;
            lotto[i++] = num;
        }while (i < lotto.length);
        System.out.println("do-while문 반복 횟수 : " + count);
        System.out.println(Arrays.toString(lotto));
    }

    //배열 내 중복값이 있는지 체크하는 메소드
    public static boolean isExist(int[] arr, int num) {
        boolean result = false;

        for (int i = 0; i < arr.length; i++) {
            // 배열 내에 동일한 번호가 있으면
            if (arr[i] == num) {
                result = true;
                break; // 가장 가까운 반복문을 빠져나온다
            }
        }
        return result;
    }
}



