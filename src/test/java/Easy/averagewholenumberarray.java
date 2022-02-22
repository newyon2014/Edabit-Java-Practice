package Easy;

import java.util.stream.IntStream;

public class averagewholenumberarray {

    public static boolean isAvgWhole(int[] arr) {
        int sumElements = 0;
        for (int i = 0; i < arr.length; i++) {
            sumElements+=arr[i];
        }
        if(sumElements%arr.length==0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isAvgWhole(new int[] {1, 1, 1}));


    }
}
