package Medium3;

import java.util.stream.IntStream;

public class IndexFiltering {
    public static String indexFilter(int[] idx, String str) {
        String idxStr = "";
        for (int i = 0; i < idx.length; i++) {
            if(idx[i]>=0)
              idxStr+=str.charAt(idx[i]);
            else
              idxStr+=str.charAt(str.length()+idx[i]);
        }
        return idxStr.toLowerCase();
    }

    public static void main(String[] args) {
        System.out.println(indexFilter(new int [] {9, -9, 2, 27, 36, 6, 5, 13, -1, 2, 0, 30, 2},"That's life, I've got you under my skin"));

        int [] arr = {9, -9, 2, 27, 36, 6, 5, 13, -1, 2, 0, 30, 2};
        String s = "That's life, I've got you under my skin";

     /*   IntStream.of(arr)
                .mapToObj(i -> String.valueOf(s.toLowerCase()).charAt(i < 0? s.length()+i:i))
                .reduceString::concat)
                .get();*/
    }
}
