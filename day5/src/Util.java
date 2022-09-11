public class Util {
    //배열 내 중복값이 있는지 체크하는 메소드
    // static이 없으면 다른 클래스에서 객체를 생성하고 사용
    public boolean isExist(int[] arr, int num) {
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
    // static이 있으면 다른 클래스에서 객체를 생성하지 않고 사용 가능
    public static void printLine(char ch, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
