package Medium5;

import java.math.BigDecimal;
import java.math.BigInteger;

public class apocalypticnumbers {
    public static String isApocalyptic(int number) {
        BigInteger f = new BigInteger(String.valueOf(2));
        BigInteger expo = f.pow(number);
        String apocalyptic = String.valueOf(expo);
        System.out.println(expo);
        System.out.println(apocalyptic);
        int apo = apocalyptic.replaceAll("(6{3})" , "").length();
        System.out.println(apo);
        int str = apocalyptic.length();
        System.out.println(str);

        return  apo==str?"Safe":(str-apo)/3==1?"Single":(str-apo)/3==2?"Double":"Triple";

    }

    public static void main(String[] args) {
        System.out.println(isApocalyptic(220));
    }
}
