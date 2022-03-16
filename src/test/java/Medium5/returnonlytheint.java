package Medium5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class returnonlytheint {
    public static int[] returnInts(Object[] arr) {
        List<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] instanceof Integer)
                arrList.add((Integer)arr[i]);
        }
        int[] intArr = new int[arrList.size()];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = arrList.get(i);
        }
        return intArr;
    }

    public static void main(String[] args) {
        Object [] arr = {9, 2, "space", "car", "lion", 16};

       int [] arrInt =  Arrays.stream(arr)
               .filter(obj -> obj instanceof Integer)
                .mapToInt(i -> (Integer) i)
                .toArray();

        for (int i :
                arrInt) {
            System.out.println(i);
        }











    }
}
