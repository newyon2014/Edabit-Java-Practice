package Easy;

import java.util.*;

public class isogramstrings {
    public static boolean isIsogram(String str) {
        int counter = 0;
        HashMap<Character,Integer> isDuplicateChar = new HashMap<>();
        char[] chars = str.toCharArray();
        for (Character ch:
                chars) {
            if(isDuplicateChar.containsKey(Character.toString(ch).toLowerCase()))
                isDuplicateChar.put(ch,isDuplicateChar.get(ch)+1);
            else
                isDuplicateChar.put(ch,1);
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(isIsogram("PasSword"));

        String name = "PasSword";

        Set<String> setofchar = new HashSet<>();
    


    }
}
