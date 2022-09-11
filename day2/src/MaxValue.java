public class MaxValue {
    public static void main(String[] args) {

        int x = 5;
        int y = 7;
        int z = 4;

        int maxValue = x; //최대값으로 가정

        if (y > maxValue) {
            maxValue = y;
        }
        if (z > maxValue) {
            maxValue = z;
        }

//        int maxValue = 0; //최대값
//
//        if (x > y) {
//            maxValue = x;
//        } else if (y > z) {
//            maxValue = y;
//        }
//
//        if (y > z) {
//            maxValue = y;
//        } else if (z > x) {
//            maxValue = z;
//        }
//
//        if (z > x) {
//            maxValue = z;
//        } else if (x > y) {
//            maxValue = x;
//        }

        System.out.println("최대값 출력");
        System.out.println(maxValue);

        }
    }
