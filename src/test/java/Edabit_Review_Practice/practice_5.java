package Edabit_Review_Practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class practice_5 {

    public static String accum(String str) {
        String newStr = Character.toString(str.charAt(0)).toUpperCase();
        int counter = 0;
        for (int i = 1; i < str.length(); i++) {
            newStr+="-";
            newStr+=Character.toString(str.charAt(i)).toUpperCase();
            while (counter < i){
                newStr+=Character.toString(str.charAt(i)).toLowerCase();
                counter++;
            }
          counter = 0;
        }
        return newStr;
    }

    public static int sumTwoSmallestNums(int[] arr) {
        int [] arr_new =  Arrays.stream(arr)
                .sorted()
                .filter(i -> i > 0)
                .toArray();

        return arr_new[0] + arr_new[1];
    }

    public static String[] capMe(String[] s) {
        return Arrays.stream(s)
                .map(str -> str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase())
                //..toArray(str -> new String[str]);
                .toArray(String[]::new);
    }

    public static boolean greaterThanOne(String frac) {
        System.out.println(Integer.parseInt(frac.split("/")[0]));
        System.out.println(Integer.parseInt(frac.split("/")[1]));
        return ((Integer.parseInt(frac.split("/")[0])) / (Integer.parseInt(frac.split("/")[1]))) > 1;
    }

    public static boolean isBetween(String first, String last, String word) {
        return first.compareTo(word) < 0 && last.compareTo(word) > 0;
    }

    public static void main(String[] args) {
        System.out.println(accum("RqaEzty"));
        System.out.println(isBetween("apple", "banana", "azure"));
        System.out.println(greaterThanOne("37/21"));

        String str = "cocodccococodededeodeede";
        System.out.println(str.length());
        int nest = 0;
        while (str.length() > 4){
            str =  str.replaceAll("code","");
            nest++;
        }

        System.out.println(nest);
    }

}
