package Easy;

import java.util.Arrays;

public class nestedarryinanotherarray {
    public static boolean canNest(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if((arr1[0] > arr2[0]) && (arr1[arr1.length-1] < arr2[arr2.length-1]))
            return true;

        return false;
    }

    public static void main(String[] args) {

    }
}
