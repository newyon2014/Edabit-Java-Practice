package Edabit_Review_Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class practice_3 {

    public static String toHex(String str) {
        return str.chars()
                .mapToObj(Integer::toHexString)
                .collect(Collectors.joining(" "));
    }

    public static String alphabetIndex(String str) {
        int offset = 'a' -1;
        String sampke = str.chars()
                .filter(c -> Character.isLetter(c))
                .mapToObj(c -> String.valueOf(c - offset))
                .collect(Collectors.joining(" "));

        /*String finalStr = " ";
        String alphabet = " abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i)))
                finalStr+=" " + alphabet.indexOf(Character.toString(str.toLowerCase().charAt(i)));
        }
        return finalStr.trim();*/
        return sampke;

    }
    public static int[] numberSplit(int n) {
        if ( n < 0)
           return  n%2==0?new int[] {n/2,n/2}:new int[] {(int)Math.round((double)n/2),n/2};

        return n%2==0?new int[] {n/2,n/2}:new int[] {n/2,(int)Math.round((double)n/2)};

    }

    public static String[]  jazzify(String[] arr) {
        if(arr.length ==0)
            return new String [] {};
        String [] arrFinal = new String [arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(!arr[i].endsWith("7"))
                arrFinal[i] = arr[i].concat("7");
            else
                arrFinal[i] = arr[i];
        }
        return arrFinal;

    }
    public static int[] timeSum(String[] s) {
        //int [] result = new int [3];
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        for (int i = 0; i < s.length; i++) {
            hours+=Integer.parseInt(s[i].split(":")[0]);
            minutes+=Integer.parseInt(s[i].split(":")[1]);
            seconds+=Integer.parseInt(s[i].split(":")[2]);
        }
        return new int[] {hours,minutes,seconds};

    }




    public static int leftDigit(String str) {
        int leftMostDigit = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                leftMostDigit = Integer.parseInt(Character.toString(ch));
                break;
            }
        }
        return leftMostDigit;
    }

    public static String spaceMeOut(String str) {
        return str.replaceAll("(?<=)"," ").trim();

    }

    public static void main(String[] args) {
        //  System.out.println(spaceMeOut("far out"));
        //System.out.println(leftDigit("TrAdE2W1n95!"));
        //System.out.println(timeSum(new String [] {"1:03:45", "1:23:05"}));
       // System.out.println(alphabetIndex("Wow, does that work?"));
      //  System.out.println(isPalindrome("A man, a plan, a cat, a ham, a yak, a yam, a hat, a canal-Panama!"));
        int [] i = {10, 40, 30, 20, 50};

        int[] newArry = Arrays.stream(i)
                .sorted()

                .toArray();




        for (int in:
            newArry ) {
            System.out.println(in);
        }

    }
}
