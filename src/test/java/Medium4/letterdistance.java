package Medium4;

import java.util.stream.IntStream;

public class letterdistance {
    public static int letterDistance(String str1, String str2) {
        int distance = 0;
        int lengthDiff = Math.abs(str1.length()-str2.length());
        if(str1.length() > str2.length()){
            for (int i = 0; i < str2.length(); i++) {
                distance+=Math.abs(str2.charAt(i) - str1.charAt(i));
            }
            distance+=lengthDiff;
            }else if(str1.length() < str2.length()){
                for (int i = 0; i < str1.length(); i++) {
                    distance+=Math.abs(str1.charAt(i) - str2.charAt(i));
                }
            distance+=lengthDiff;
            }else {
            for (int i = 0; i < str1.length(); i++) {
                distance+=Math.abs(str1.charAt(i) - str2.charAt(i));
            }
        }
        return distance;
    }

    public static void main(String[] args) {
        System.out.println(letterDistance("house", "fly"));
        String str1 = "house";
        String str2 = "fly";

        IntStream.rangeClosed(0,Math.min(str1.length(),str2.length()))
                 .map(i -> Math.abs(str1.charAt(i)- str2.charAt(i)))
                .sum();

    }

}
