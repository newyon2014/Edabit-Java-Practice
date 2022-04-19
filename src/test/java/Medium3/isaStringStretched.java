package Medium3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class isaStringStretched {
    public static boolean isStretched(String str1, String str2) {
       int count = 1;
        for(int i = 0; i < str1.length()-1; i++)
            if(str1.charAt(i) != str1.charAt(i+1))
                break;
            else
                count++;
        System.out.println(count);
        return str1.length() == str2.length()*count;
    }

    public static void main(String[] args) {
        System.out.println(isStretched("pppaaannndddaaa", "panda"));
    }
}
