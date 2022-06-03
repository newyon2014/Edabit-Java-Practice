package Medium;

import java.util.Arrays;
import java.util.stream.IntStream;

public class sumofmissingnumbers {
    public static int sumMissing(int[] arr) {
        Arrays.sort(arr);
        int arraySum = Arrays.stream(arr).sum();
        int totalSum = IntStream.rangeClosed(arr[0],arr[arr.length-1]).sum();
        return ( Math.abs(totalSum)-Math.abs(arraySum) );

    }

    public static void main(String[] args) {

       // System.out.println(new int[]{1, 3, 5, 7, 10});
        int [] arr = {99, 2, 45, 4, 17};
        Arrays.sort(arr);
        int arraySum = Arrays.stream(arr).sum();
        System.out.println(arraySum);
        int totalSum = IntStream.rangeClosed(arr[0],arr[arr.length-1]).sum();
        System.out.println(totalSum);





    }
}
