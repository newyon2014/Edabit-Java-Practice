package Medium3;

import java.util.Arrays;

public class commondivisorarray {
    public static int GCD(int[] array) {
        int maxGCD = 1;
        Arrays.sort(array);
        int j = 1;
        for (int i = 0; i < array.length-2; i++) {
            while(j < array[array.length-1]){
                if(array[i]%j==0 && array[i+1]%j==0 && array[i+2]%j==0){
                    maxGCD = Math.max(maxGCD,j);
                  //  break;
                }
                j++;
            }
        }
        return maxGCD;
    }

    public static void main(String[] args) {
        System.out.println(GCD(new int [] {1, 2}));
        int [] array = {1024, 192, 2048, 512};
        Arrays.sort(array);
        int maxGCD = 1;
        int j = 1;
        while(j < array[array.length-1]){
            if(array[0]%j==0){
                maxGCD = Math.max(maxGCD,j);
     //           System.out.println(maxGCD);
                //  break;
            }
            j++;
        }
    }


}
