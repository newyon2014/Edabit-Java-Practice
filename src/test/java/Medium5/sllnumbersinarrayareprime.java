package Medium5;

import java.util.Arrays;
import java.util.stream.IntStream;

public class sllnumbersinarrayareprime {
    public static boolean allPrime(int[] arr) {
        return (int)Arrays.stream(arr)
              //  .forEach(i -> System.out.println(i));
                .filter(i -> reallyPrime(i))
              .count() == arr.length;
    }
    public static boolean reallyPrime(int n){
        if(n <=1)
            return false;

        return !IntStream.rangeClosed(2,n/2)
                .anyMatch(i -> n%i==0);

        /*boolean isPrime = true;
        if(n <=1)
            isPrime = false;
        for (int i = 2; i < n/2; i++) {
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;*/
    }

    public static void main(String[] args) {
        //System.out.println(reallyprime(5));
       System.out.println(allPrime(new int [] {3, 5, 7, 11, 17, 19}));
    }

}
