package Easy;

import java.util.Arrays;

public class wagechallenge {

    public static int programmers(int one, int two, int three) {
        int [] wages = new int[3];
               wages[0] = one;
               wages[1] = two;
               wages[2] = three;
        Arrays.sort(wages);
        return wages[2] - wages[0];
    }

    public static void main(String[] args) {

        System.out.println(programmers(147, 33, 526));

    }
}
