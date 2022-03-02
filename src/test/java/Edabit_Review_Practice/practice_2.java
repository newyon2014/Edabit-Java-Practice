package Edabit_Review_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class practice_2 {

    public static boolean isSpecialArray(int[] arr) {
        boolean isEven = true;
        boolean isOdd = true;

        for (int i = 0; i < arr.length; i+=2) {
            if (arr[i] % 2 != 0) {
                isEven = false;
              //  break;
            }
            //break;
        }

        for (int i = 1; i < arr.length; i+=2) {
            if(arr[i]%2 == 0)
                isOdd = false;
           // break;
        }
        return isEven && isOdd;

    }
    public static String remix(String str, int[] arr) {
        char [] arrFinal = new char [str.length()];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
          arrFinal[arr[i]] = ch;
        }
        StringBuilder sb = new StringBuilder();

        for (char c:
             arrFinal) {
            sb.append(c);
        }
        return sb.toString();

    }
    public static int incrementToTop(int[] arr) {
        Arrays.sort(arr);
        int steps = 0;
        for (int i = 0; i < arr.length; i++) {
            steps+=arr[arr.length-1]-arr[i];
        }
        return steps;
    }
    public static int countTrue(boolean[] arr) {
        return 0;


    }
    public static String wurstIsBetter(String s) {
        return s.replaceAll("(Kielbasa)|(Chorizo)|(Moronga)|(Salami)|(Sausage)|(Andouille)|(Naem)|(Merguez)|(Gurka)|(Snorkers)|(Pepperoni)","Wursts");
    }
    public static boolean same(int[] a1, int[] a2) {
        a1 =  Arrays.stream(a1).distinct().toArray();
        a2 = Arrays.stream(a2).distinct().toArray();

        return Arrays.equals(a1,a2);
    }
    public static int[] removeDups(int[] nums) {
      return Arrays.stream(nums)
                .distinct()
                .toArray();

    }

    public static String[] removeDups(String[] str) {
        return Arrays.stream(str).distinct().toArray(String[]::new);


    }
    public static double discount(int price, int percentage) {
        return Math.round(price - price * (double)percentage/100);
    }
    public static boolean isPotentialFriend(String[] y, String[] o) {
        int match = 0;
        if(y.length==1 & o.length==1)
            if(y[0].equalsIgnoreCase(o[0]))
                return true;
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < o.length; j++) {
                if(y[i].equalsIgnoreCase(o[j]))
                    match++;
            }
        }
        return match>=2?true:false;
    }
    public static String decimator(String s) {
         return s.substring(0,(s.length()-(int)Math.ceil((float)s.length()/10)));
    }
    public static boolean letterCheck(String[] s) {
        String a = s[0].toLowerCase();
        String b = s[1].toLowerCase();
        for (int i = 0; i < s[1].length(); i++) {
            if(!a.contains(Character.toString(b.charAt(i))))
               return false;
        }
        return true;

    }
    public static boolean canAlternate(String str) {
        int zeroLength = str.replaceAll("[^0]","").trim().length();
        System.out.println(zeroLength);
        int oneLength = str.replaceAll("[^1]","").trim().length();
        System.out.println(oneLength);

        if (zeroLength == oneLength +1 || oneLength == zeroLength +1 )
            return true;
        return false;
    }
    public static int[] calculateScores(String str) {
        if(str.length()==0)
            return new int[] {0,0,0};
        int andyScore = 0;
        int benScore = 0;
        int charlotteScore = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='A')
                andyScore++;
            else if (str.charAt(i)=='B')
                benScore++;
            else
                charlotteScore++;
        }
        return new int[] {andyScore,benScore,charlotteScore};

    }
    public static boolean isPrime(int num) {
        boolean isPrime = true;
        if(num <=2)
            return true;

        for (int i = 3; i < num; i++) {
            if(num%i==0)
                isPrime = false;
        }
        return isPrime;
    }

    public static void main(String[] args) {

     //   System.out.println(isPrime(31));
      //  System.out.println(canAlternate("01001"));
     //   System.out.println(letterCheck(new String [] {"assert", "staring"}));
       // System.out.println(wurstIsBetter("I like chorizos, but not sausages"));
      //  System.out.println(remix("abcd", new int [] {0, 3, 1, 2}));
        System.out.println(isSpecialArray(new int[] {2, 7, 4, 9, 6, 1, 6, 3}));
        /*System.out.println(incrementToTop(new int[]{3, 10, 3}));
        String name = "pppaaannndddaaa";

        name.chars()
                .mapToObj(c -> (char)c)
                .distinct()
                .co
        System.out.println(newName);*/
    }
}
