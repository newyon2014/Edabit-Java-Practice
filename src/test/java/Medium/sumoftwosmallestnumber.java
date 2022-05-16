package Medium;

import java.util.Arrays;
import java.util.stream.Collectors;

public class sumoftwosmallestnumber {

    public static void main(String[] args) {

        int [] arr = {879, 953, 694, -847, 342, 221, -91, -723, 791, -587};

        Arrays.sort(arr);

        for (int i:
             arr) {
            System.out.println(i);
        }

        System.out.println(arr);

        int[] arrSorted = Arrays.stream(arr)
                .filter(num -> num > 0)
                .sorted()
                .toArray();

        System.out.println(arrSorted);
    }
}
