package Easy;

import java.util.stream.IntStream;

public class specialarrayoddandeven {

    public static boolean isSpecialArray(int[] arr) {
       return IntStream
                .range(0,arr.length)
                .allMatch(
                    i -> (i%2==0 && arr[i]%2==0) || (i % 2 !=0 && arr[i]%2!=0)
                );
       }

    public static void main(String[] args) {

        System.out.println(isSpecialArray(new int[]{2, 1, 4, 3, 6, 7, 6, 4}));
    }
}
