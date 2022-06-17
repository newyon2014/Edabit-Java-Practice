package Medium2;

import java.util.Arrays;

public class filterbydigitlength {
    public static int[] filterByLength(int[] numbers, int length) {
        return Arrays.stream(numbers)
                .mapToObj(i -> Integer.toString(i))
                .filter(str -> str.length() == length)
                .mapToInt(str -> Integer.valueOf(str))
                // .forEach(i -> System.out.println(i));
                .toArray();

    }

    public static void main(String[] args) {

        int [] arr = {88, 232, 4, 9721, 555};

        // .forEach(i -> System.out.println(i));
        int[] arr2 = Arrays.stream(arr)
                .mapToObj(i -> Integer.toString(i))
                .filter(str -> str.length() == 2)
                .mapToInt(str -> Integer.valueOf(str))
                // .forEach(i -> System.out.println(i));
                .toArray();

        for (int i:
             arr2) {
            System.out.println(i);
        }


    }

}
