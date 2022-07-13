package Medium3;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class karacasencryption {
    public static String encrypt(String word) {
        String reverse = new StringBuilder(word).reverse().toString();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < reverse.length(); i++) {
            char c = reverse.charAt(i);
           switch(c){
               case 'a': c='0';sb.append(c);break;
               case 'e': c='1';sb.append(c);break;
               case 'i': c='2';sb.append(c);break;
               case 'o': c='2';sb.append(c);break;
               case 'u': c='3';sb.append(c);break;
               default : sb.append(c);break;
           }
        }
        return sb.append("aca").toString();
    }

    public static void main(String[] args) {
        System.out.println(encrypt("alpaca"));

    }
}
