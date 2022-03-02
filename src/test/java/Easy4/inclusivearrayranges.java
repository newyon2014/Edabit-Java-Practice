package Easy4;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class inclusivearrayranges {
    public static int[] inclusiveArray(int startNum,int endNum) {

        return startNum > endNum? new int[] {startNum}: IntStream.rangeClosed(startNum,endNum)
                                                                 .boxed()
                                                                 .mapToInt(Integer::intValue)
                                                                 .toArray();
    }


    public static void main(String[] args) {
        int startNum = 1;
        int endNum = 5;

        int [] arr = IntStream.rangeClosed(startNum,endNum)
                .boxed()
                .mapToInt(Integer::intValue)
                .toArray();

        for (int i:
             arr) {
            System.out.println(i);
        }
    }

}
