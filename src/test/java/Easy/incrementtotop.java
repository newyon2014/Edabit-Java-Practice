package Easy;

import java.util.Arrays;

public class incrementtotop {

    public static int incrementToTop(int[] arr) {
        Arrays.sort(arr);
        int incrementCount = 0;
        if(arr[0]==arr[arr.length-1])
            return 0;
        for (int i = 0; i < arr.length-1; i++)
            incrementCount+=arr[arr.length-1]-arr[i];

        return incrementCount;
    }

    public static void main(String[] args) {
        System.out.println(incrementToTop(new int []{3, 10, 3}));

    }
}
