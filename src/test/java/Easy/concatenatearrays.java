package Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class concatenatearrays {

    public static int[] concat(int[] arr1, int[] arr2) {
        List<Integer> concatenatedArray = new ArrayList<Integer>();
        for (int i:
             arr1) {
            concatenatedArray.add(Integer.valueOf(i));
        }
        for (int i:
                arr2) {
            concatenatedArray.add(Integer.valueOf(i));
        }
        return concatenatedArray.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {


    }
}
