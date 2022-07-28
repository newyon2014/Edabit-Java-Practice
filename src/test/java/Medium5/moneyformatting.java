package Medium5;

import java.text.NumberFormat;

public class moneyformatting {
    public static String dolladollaBills(double money) {
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
        return defaultFormat.format(Math.abs(money));
    }
    public static void main(String[] args) {
        System.out.println(dolladollaBills(-56.99));
    }
}
