package Easy3;

import java.util.Arrays;

public class findlargestevennumber {
    public static int probe(int[] r) {
        int [] rSorted = Arrays.stream(r)
                .filter(i -> i%2==0)
                .sorted()
                .toArray();

       return (rSorted.length==0?-1:rSorted[rSorted.length-1]);

    }

    public static void main(String[] args) throws Exception{
       System.out.println(probe(new int [] {0, 19, 18973623}));
 /*       int [] arr = {1, 3, 5, 7};

        int [] arrs = Arrays.stream(arr)
              .filter(i -> i%2==0)
              .sorted()
              .toArray();

        if(arrs.length==0)
            System.out.println("-1");*/
    }
}
