package Medium4;

import java.util.ArrayList;
import java.util.Arrays;

public class potentialfriend {
    public static boolean isPotentialFriend(String[] y, String[] o) {
        int match = 0;
        if(y.length==1 & o.length==1)
            if(y[0].equalsIgnoreCase(o[0]))
                return true;
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < o.length; j++) {
                if(y[i].equalsIgnoreCase(o[j]))
                    match++;
            }
        }
        return match>=2?true:false;
    }

    public static void main(String[] args) {
        System.out.println(isPotentialFriend(new String[] {"cycling", "technology", "reading"}, new String[] {"dancing", "planes", "politics"}));
        String [] a = new String[] {"cycling", "technology", "reading"};
        String [] b = new String[] {"dancing", "planes", "politics"};

        final boolean b1 = Arrays.stream(a)
                .map(strofa -> Arrays.stream(b).anyMatch(strofb -> strofb.equalsIgnoreCase(strofa)) ? strofa : "")
                .filter(str -> str.length() > 1)
                .count() >= 2;
    }
}
