package Easy;

import java.util.Arrays;
import java.util.List;

public class arraysmaxmin {

    public static int differenceMaxMin(int[] arr) {
        int maxInteger,minInteger =0;
        maxInteger = Arrays
                .stream(arr)
                .sorted()
                .max()
                .getAsInt();

        minInteger = Arrays
                .stream(arr)
                .sorted()
                .min()
                .getAsInt();

        return maxInteger-minInteger;



    }

    public static void main(String[] args) {




    }
}
