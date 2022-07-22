package Medium4;

import java.util.ArrayList;
import java.util.List;

public class minipeaks {
    public static int[] miniPeaks(int arr[]) {

        List<Integer> peakList = new ArrayList<Integer>();
        int index = 1;
        while(index <= arr.length-2){
            if(arr[index-1] < arr[index] &&  arr[index+1] < arr[index] )
                peakList.add(arr[index]);
                index++;
        }
        int [] peakArr = new int[peakList.size()];
        for (int i = 0; i < peakArr.length; i++) {
            peakArr[i] = peakList.get(i);
        }
        return peakArr.length==0?new int[]{}:peakArr;
    }

    public static void main(String[] args) {
        int[] arrresult = miniPeaks(new int[]{4, 5, 2, 1, 4, 9, 7, 2});
        for (int i:
             arrresult) {
            System.out.println(i);
        }

    }
}
