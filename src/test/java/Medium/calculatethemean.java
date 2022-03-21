package Medium;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class calculatethemean {


    public static double mean(int[] nums) {
        double arraySum = 0.00;
        for (int i = 0; i < nums.length; i++) {
            arraySum+=nums[i];
        }
        double arrayMean=arraySum/nums.length;
        return Math.round(arrayMean*100.0)/100.0;
    }




    public static void main(String[] args) {
        System.out.println((mean(new int [] {1, 0, 4, 5, 2, 4, 1, 2, 3, 3, 3})));

    }
}
