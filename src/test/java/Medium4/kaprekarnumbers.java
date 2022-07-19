package Medium4;

import java.math.BigInteger;

public class kaprekarnumbers {
    public static boolean isKaprekar(int n) {
        String squared = String.valueOf((long) n * n);
        int left = 0;
        int right = 0;
        int k = squared.length() / 2;
        if (squared.length() == 1) {
            left = 0;
            right = Integer.parseInt(squared);
        } else {
            left = Integer.parseInt(squared.substring(0, k));
            right = Integer.parseInt(squared.substring(k));
        }
        return left + right == n;
    }


    public static void main(String[] args) {
        System.out.println(isKaprekar(77778));
    }
}
