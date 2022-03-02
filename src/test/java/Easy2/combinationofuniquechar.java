package Easy2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class combinationofuniquechar {
    public static int countUnique(String s1, String s2) {
       String distinct = Arrays.stream(s1.split(""))
                .distinct()
                .collect(Collectors.joining());

        for(int i=0;i < s2.toCharArray().length-1;i++){
            if(!distinct.contains(Character.toString(s2.charAt(i))))
                distinct+=s2.charAt(i);
        }
        return distinct.length();
    }


    public static void main(String[] args) {

          }
}
