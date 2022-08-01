package Medium5;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class repeattheshorterstring {
    public static String lengthen(String str1, String str2) {
        String strShort = (str1.length() <= str2.length()) ? str1 : str2;
        String strLong = (str1.length() <= str2.length()) ? str2 : str1;
            for (int i = 0; i < strShort.length(); i++) {
                strShort+=strShort.charAt(i);
                if(strShort.length() < strLong.length())
                    continue;
                else
                     break;
        }
        return strShort;

    }
    public static void main(String[] args) {
        System.out.println(lengthen("ingenius", "forest"));
    }
}
