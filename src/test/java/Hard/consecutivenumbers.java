package Hard;

import java.util.Arrays;

public class consecutivenumbers {
    public static boolean cons(int[] arr) {
        Arrays.sort(arr);
        for (int i:
             arr) {
            System.out.println(i);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] != arr[i] + 1)
                    return false;
            }
            break;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(cons(new int [] {5, 1, 4, 3, 2, 6}));
    }
}
