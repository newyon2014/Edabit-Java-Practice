package Medium3;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

public class curizonnumbers {
    public static boolean isCurzon(int n) {
        double first = Math.pow(2,n)+1;
        double second = 2*n + 1;
        BigDecimal decimalFirst = new BigDecimal(first);
        System.out.println(decimalFirst);
        BigDecimal decimalSecond = new BigDecimal(second);
        System.out.println(decimalSecond);
       // MathContext mc = new MathContext(100);
        BigDecimal remain = decimalFirst.remainder(decimalSecond);
        System.out.println(remain);


       // BigDecimal result = decimalFirst.remainder(decimalSecond);
       System.out.println(remain);

       return remain.equals("0");
    }

    public static void main(String[] args) {
        System.out.println(isCurzon(5));
    }
}
