package Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class factorizeanumbertoarray {
    public static int[] factorize(int num) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            if(num%i==0)
                list.add(i);
        }

        int[] factorialArray = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            factorialArray[i] = list.get(i);
        }
        return factorialArray;
    }

    public static void main(String[] args) {

        int num = 12;

        IntStream.rangeClosed(1,num+1)
                .filter(i -> num%i==0)
                .toArray();

    }
}
