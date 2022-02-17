package Edabit_Review_Practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Practice_6 {


    public static void main(String[] args) {
        String s = "What an easy task, right";
        System.out.println(Arrays.toString(s.split(" ")));

        int [] arr = {12, 2000, 13, 1979, 12, 17};

        IntStream.rangeClosed(0,arr.length)
                .boxed()
                .map(i -> Integer.toString(i))
                .filter(i -> i.length() >= 2)
                .mapToInt(i -> Integer.parseInt(i))
                .toArray();
    }

}
