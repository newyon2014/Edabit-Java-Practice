package Easy2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class capitalizestartofword {

    public static String makeTitle(String s) {
        String [] arr = s.split(" ");
        return Arrays.stream(arr)
                .map(n -> n.substring(0,1).toUpperCase()+ n.substring(1))
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {

    }
}
