package Easy3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class findthesecondlargest {
    public static int secondLargest(int[] num) {

        int[] numSorted = Arrays.stream(num)
                .boxed()
                .sorted(Comparator.reverseOrder())
                // .mapToInt(Integer::intValue)
                .mapToInt(i -> new Integer(i))
                .toArray();

/*        int[] numSorted = IntStream.rangeClosed(0, num.length)
                .sorted()
                .toArray();*/

        for (int i:
            numSorted ) {
            System.out.println(i);
        }

        return numSorted[1];


    }

    public static void main(String[] args) {

        System.out.println(secondLargest(new int [] {10, 40, 30, 20, 50}));

    }
}
