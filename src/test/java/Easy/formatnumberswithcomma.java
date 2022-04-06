package Easy;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class formatnumberswithcomma {

    public static String formatNum(int num) {
        BigInteger integer = BigInteger.valueOf(num);
        return NumberFormat.getNumberInstance().format(integer);
    }

    public static void main(String[] args) {
        System.out.println(formatNum(100000));

    }
}
