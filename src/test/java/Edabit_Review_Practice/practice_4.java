package Edabit_Review_Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class practice_4 {
    public static String censor(String str) {
        StringBuilder sb = new StringBuilder();
        String [] words = str.split("\\s");
        String charachters = "";
        int count = 0;
        for(String word:words){
            if(word.length() <= 4)
                sb.append(word).append(" ");
            else {
                while(count < word.length()){
                    charachters+="*";
                    count++;
                }
                sb.append(charachters).append(" ");
            }
            charachters = "";
        }
        return charachters;
    }
    public static int incrementToTop(int[] arr) {
        Arrays.sort(arr);
        int steps = 0;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] !=arr[arr.length-1]){
                while(arr[i] < arr[arr.length-1]){
                    steps++;
                    arr[i]++;
                }
            }
        }
        return steps;
    }
    public static String add(String a, String b) {
        if(a==null || a=="" || b==null || b=="")
            return  "Invalid Operation";

        return Integer.toString(Integer.parseInt(a) + Integer.parseInt(b));
    }
    public static int powerRanger(int power, int min, int max) {
        int count = 0;
        for (int i = 1;  ; i++) {
            if(Math.pow(i,power) <= max && Math.pow(i,power) >= min)
                count ++;

            if ( Math.pow(i,power) >= max)
                break;
        }
        return count;
    }
    public static int[] hashPlusCount(String s) {
        return new int [] {s.replaceAll("[^\\#]","").trim().length(),
                s.replaceAll("[^\\+]","").trim().length()};
    }
    public static double[] findLargestNums(double[][] arr) {
        double [] newArr = new double[arr.length];
        double max = Double.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            max = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > max){
                    max = arr[i][j];
                    newArr[index] = max;
                }
            }
            index++;
        }
        for (double d:newArr) {
            System.out.println(d);
        }
        return newArr;

    }
    public static String remix(String str, int[] arr) {
        String newStr = " ";
       char [] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[arr[i]] = str.charAt(i);
        }
        for (char c: ch) {
            newStr+=c;
        }
        return newStr;
    }
    public static int countWords(String s) {
        return (int)Arrays.stream(s.split("\\s"))
                .count();
    }
    public static String getMiddle(String word) {
        if(word.length()%2!=0)
            return Character.toString(word.charAt(word.length()/2));

        return word.substring((word.length()/2 - 1),word.length()/2);
    }
    public static boolean rectangleInCircle(int w, int h, int radius) {
        return (Math.pow(w,2) + Math.pow(h,2) <= Math.pow(radius*2,2));
    }
    public static boolean sameAscii(String a, String b) {
        return a.chars().sum() == b.chars().sum();
    }
    public static int nthSmallest(int[] arr, int n) {
        Arrays.sort(arr);

        return arr.length < n? -1: arr[n-1];
    }
    public static int gcd(int a, int b) {
        if (a==b)
            return a;
        int GCD = 1;
        for (int i = 1; i < b; i++) {
            if(a%i==0 && b%i==0)
                if (i > GCD)
                    GCD = i;
        }
        return GCD;

    }
    public static boolean isPrefix(String word, String prefix) {
        return word.startsWith(prefix.substring(0,prefix.length()-1));
    }
    public static boolean isSuffix(String word, String suffix) {
        System.out.println(suffix.substring(1));
        return word.endsWith(suffix.substring(1));
    }
    public static void main(String[] args) {
        System.out.println(
                IntStream.rangeClosed(0,4)
                        .reduce((a,b) -> a*b).toString()

        );



    //    System.out.println(incrementToTop(new int [] {3, 3, 3}));
       // System.out.println(powerRanger(3, 1, 27));
        //System.out.println(remix("abcd",new int[] {0, 3, 1, 2}));
    //    System.out.println(findLargestNums(new double[][]{{4, 2, 7, 1}, {20, 70, 40, 90}, {1, 2, 0}}));
     //   System.out.println(sameAscii("AA", "B@"));
     //   System.out.println(rectangleInCircle(8, 6, 5));
       // System.out.println(gcd(14, 14));
        //System.out.println(isPrefix("automation", "auto-"));
       // System.out.println(isSuffix("arachnophobia", "-phobia"));
     /*   String str = "Wow, does that work?";
        int offset = 'a' - 1;
        String dk = str.toLowerCase().chars()
                .filter(c -> Character.isLetter(c))
                .mapToObj(cp -> String.valueOf(cp - offset))
                .collect(Collectors.joining(" "));

        System.out.println(dk);

        String str2 = "She ran hurriedly towards the stadium.";
        str2 = str2.replaceAll("[^a-zA-z0-9\" \"]","");
        System.out.println(str2);
        System.out.println(Arrays.stream(str2.split("\\s"))
                //.forEach(s -> System.out.println(s));
                .filter(word -> word.endsWith("ly"))
             .count());*/

      //  System.out.println(list.size());







    }
}
