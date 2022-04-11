package Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class stretchedwords {
    public static String unstretch(String word) {
        StringBuilder sb = new StringBuilder();
        String finalStr = "";
        char[] chr = word.toCharArray();

        return sb.toString();
    }

    public static void main(String[] args) {
      //  System.out.println(unstretch("eeeennnnsuuurrre"));
        String string = "eeeennnnsuuurrre";
        System.out.println(string.replaceAll("(.)\1+" , string));
        String nonrepeating = "";

    }
}
