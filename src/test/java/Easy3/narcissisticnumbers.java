package Easy3;

import java.util.stream.IntStream;

public class narcissisticnumbers {
    public static boolean isNarcissistic(int num) {
        int pow = Integer.toString(num).length();
        String numStr = Integer.toString(num);
        int powSum = 0;
        for (int i = 0; i < numStr.length(); i++) {
            powSum+=Math.pow(Integer.valueOf(Character.toString(numStr.charAt(i))),pow);
        }
       return powSum==num;
    }

    public static void main(String[] args) {
        System.out.println(isNarcissistic(153));
    }
}
