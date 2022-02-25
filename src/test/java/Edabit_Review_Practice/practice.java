package Edabit_Review_Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class practice {

    public static String stripSentence(String str, String chars) {
       // String name = "the quick brown fox jumps over the lazy dog";
      //  String vowels = "aeiou";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(!chars.contains(Character.toString(str.charAt(i))))
                sb.append(str.charAt(i));
            else
                sb.append("");
        }
       // String newSentenece = sb.toString().trim();
       // System.out.println(newSentenece);
        return sb.toString().trim();

    }
    public static String reverseCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch))
                sb.append(Character.toUpperCase(ch));
            else if(Character.isUpperCase(ch))
                sb.append(Character.toLowerCase(ch));
            else
                sb.append(ch);
        }
        return sb.toString();
    }

    public static boolean isPrefix(String word, String prefix) {
        return word.startsWith(prefix.substring(0,prefix.length()-1));

    }

    public static boolean isSuffix(String word, String suffix) {
        return word.endsWith(suffix.substring(0,suffix.length()-1));

    }
    public static int sum(int[] arr) {
        int sum = 0;
        int i = 0;
        while (i < arr.length){
            sum +=arr[i];
            i ++;
        }

        return sum;

    }

    public static int sumDigits(int a, int b) {
        int totalSum = 0;
        if (a < 10 && b < 10)
            return a + b ;
        for (int i = a; i <= b; i++) {
            totalSum+=sumDigit(i);
        }
        return totalSum;
    }

    public static int sumDigit (int n){
        int sum = 0;
        while (n > 0){
            sum += n %10;
            n = n/ 10;
        }
       // System.out.println(sum);
        return sum;
    }

    public static int solveEquation(String equation) {
        if (equation.contains("+"))
            return Integer.parseInt(equation.split("=")[1].trim()) -
                    Integer.parseInt(equation.split("=")[0].split("\\+")[1].trim());

          return Integer.parseInt(equation.split("=")[1].trim()) -
                  Integer.parseInt(equation.split("=")[0].split("-")[1].trim());
    }

    public static int wordNest(String word, String nest) {
        int count = 0;
        while (nest.length() != word.length()){
            nest = nest.replaceAll(word,"");
            count ++;
        }
        return count;
   }

    public static double discount(int price, int percentage) {
        return price - price*percentage/100;
    }

    public static String alternatingCaps(String s) {
        boolean isUpper = true;
        StringBuilder sb = new StringBuilder();
        for (char c:s.toCharArray()) {
            char ch = c;
            if(ch !=' '){
                ch = isUpper ? Character.toUpperCase(c):Character.toLowerCase(c);
                isUpper = ! isUpper;
            }
            sb.append(ch);
        }
        return sb.toString();
    }

    public static boolean isNarcissistic(int num) {
        return (num < 10) ? true : (num < 100) ? false
                : num == ("" + num).chars()
                .map(cp -> (int)Math.pow(Character.getNumericValue(cp), ("" + num).length()))
                .sum();
        /*if (num < 10)
            return false;

        int powerOf = Integer.toString(num).length();
        int sumToPowerOf = 0;

        while (num != 0){
            int rightMost = num % 10;
            sumToPowerOf= (int)Math.pow(rightMost,powerOf) + sumToPowerOf;
            System.out.println("sum value inside "+ sumToPowerOf);
            num = num / 10;
        System.out.println("num value "+ num);

        }
        System.out.println("sum value "+ sumToPowerOf);
        return (sumToPowerOf == num);*/
    }

    public static boolean isInOrder(String str){
        return str.equalsIgnoreCase(Stream.of(str.split(""))
                .sorted()
                .collect(Collectors.joining("")));

     }

    public static boolean isValidPhoneNumber(String s) {

        return s.replaceAll("\\(\\d{3}\\)\\s\\d{3}[-]\\d{4}","").length() ==0;

    }

    public static void main(String[] args) {
        //System.out.println(isValidPhoneNumber("(123) 456-7890"));
       // System.out.println(isInOrder("xyzz"));
      //  System.out.println(isNarcissistic(8208));
      //  System.out.println(alternatingCaps("How are you?"));
       // System.out.println(discount(1500, 50));
      //  System.out.println(wordNest("code", "cocodccococodededeodeede"));
        //System.out.println(solveEquation("x + 43 = 50"));
     //   System.out.println(sumDigits(10, 12));
       // System.out.println(isPrefix("automation", "auto-"));
       // System.out.println(reverseCase("Happy Birthday"));

    }
}
