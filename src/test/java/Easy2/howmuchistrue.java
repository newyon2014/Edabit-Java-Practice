package Easy2;

import java.util.Arrays;

public class howmuchistrue {
    public static int countTrue(boolean[] arr) {
        int count = 0;
        for (boolean isTruthThere:
             arr) {
            if(isTruthThere==true)
                count++;
        }
        return count;
    }
}
