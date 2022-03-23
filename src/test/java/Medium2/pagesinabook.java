package Medium2;

import java.util.stream.IntStream;

public class pagesinabook {

    public static boolean pagesInBook(int total) {
        int sum = 0;
        for (int i = 1; i < total; i++) {
            sum += i;
            if (sum == total) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int total = 4005;

        System.out.println(IntStream.range(0,total)
                .sum()==total);
    }
}
