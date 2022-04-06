package Easy;

import java.util.Arrays;

public class nthsmallestelement {

    public static int nthSmallest(int[] arr, int n) {
        Arrays.sort(arr);
        if(n>arr.length)
            return -1;
        return arr[n-1];
    }

    public static void main(String[] args) {

        System.out.println(nthSmallest(new int[]{7, 3, 5, 1},2));

    }
}
