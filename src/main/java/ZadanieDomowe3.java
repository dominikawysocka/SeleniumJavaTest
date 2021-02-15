import java.lang.reflect.Array;
import java.util.stream.IntStream;

public class ZadanieDomowe3 {

    public static void main(String[] args) {

//        for (int i = 0; i <= 100; i++) {
//            if (i % 3 == 0) {
//                System.out.println(i);
//            }
//        }
        int[] intArray = new int[]{1, 3, 5};

        for (int i = 0; i < intArray.length / 2; i++) {
            int temp = intArray[i];
            intArray[i] = intArray[intArray.length - 1 - i];
            intArray[intArray.length - 1 - i] = temp;
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i] + " , ");
        }
    }


}
