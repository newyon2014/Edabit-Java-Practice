package Medium5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Collectors;

public class sortunsortable {
    public static Object[] sortIt(Object[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (getValue(arr[j]) > getValue(arr[j+1])) {
                    Object aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
        return arr;
    }
    public static int getValue(Object obj) {
        if (obj instanceof Integer) {
            return (int) obj;
        }
        return ((int[]) obj)[0];

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortIt(new Object[]{new int[]{4}, 1, new int[]{3}})));

        Object[] arr = new Object[]{new int[]{4}, 1, new int[]{3}};

        System.out.println(arr[0]);

       // System.out.println(Integer.valueOf((int)arr[0]));



    }
}
