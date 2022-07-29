package Medium5;

import java.sql.SQLOutput;

public class percentagechanged {
    public static void main(String[] args) {
        String str1 = "$100";
        String str2 = "$950";
        double oldPrice = Double.parseDouble(str1.replaceAll("\\$(\\d+)","$1"));
        System.out.println(oldPrice);
        double newPrice = Integer.parseInt(str2.replaceAll("\\$(\\d+)","$1")) ;
        System.out.println(newPrice);

        System.out.println((oldPrice > newPrice)? (int)(100-(newPrice/oldPrice)*100)+"$"+" decrease": (int) (newPrice - oldPrice) +"$"+" increase");
    }
}
