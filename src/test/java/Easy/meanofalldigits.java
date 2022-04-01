package Easy;

import java.util.stream.IntStream;

public class meanofalldigits {
    public static int mean(int a) {
        char[] chartoSum = String.valueOf(a).toCharArray();
        int sumOfDigits = 0;

        for (int i = 0; i < chartoSum.length; i++) {
            sumOfDigits+=Integer.parseInt(Character.toString(chartoSum[i]));
        }
        return (sumOfDigits/chartoSum.length);
    }

    public static void main(String[] args) {
        System.out.println(mean(42));

    }
}
