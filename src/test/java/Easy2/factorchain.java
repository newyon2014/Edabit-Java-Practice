package Easy2;

import java.util.stream.IntStream;

public class factorchain {
    public static boolean factorChain(int[] arr) {
        int countOfFactor=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1]%arr[i]==0)
                countOfFactor++;
        }
        return countOfFactor==arr.length-1;
    }

    public static void main(String[] args) {
        System.out.println(factorChain(new int[]{2, 4, 6, 7, 12}));

        int [] arr = new int[]{2, 4, 6, 7, 12};

        IntStream.rangeClosed(0,arr.length)
                .allMatch(i -> {
                    return arr[i]%arr[i-1]==0;
                });
    }
}
