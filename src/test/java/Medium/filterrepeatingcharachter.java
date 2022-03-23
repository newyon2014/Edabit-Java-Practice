package Medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class filterrepeatingcharachter {
    public static String[] identicalFilter(String[] arr) {
        List<String> listOfStrings = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(isDuplicate(arr[i]))
                listOfStrings.add(arr[i]);
        }

        String [] arrayOfDuplicates = new String[listOfStrings.size()];

        for (int i = 0; i < listOfStrings.size(); i++) {
            arrayOfDuplicates[i]  = listOfStrings.get(i);
        }
        return arrayOfDuplicates;
    }

    public static boolean isDuplicate (String str) {
        Set<String> stringSet = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            stringSet.add(Character.toString(str.charAt(i)));
        }
        if(stringSet.size()==1)
            return true;

        return false;
    }

    public static void main(String[] args) {


    }
}
