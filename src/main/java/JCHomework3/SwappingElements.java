package JCHomework3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SwappingElements {
   static String [] array1Str = {"1", "2", "3"};
   static Integer [] array2int = {4, 5, 6};

    public static void main(String[] args) {
        SwapElementCl<Object> swapElementCl = new SwapElementCl<>();
        try {
            System.out.println(Arrays.toString(swapElementCl.swapElements(array1Str, 0, 2)));
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
        try {
            System.out.println(Arrays.toString(swapElementCl.swapElements(array2int, 1, 2)));
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();

        }
    }
}
