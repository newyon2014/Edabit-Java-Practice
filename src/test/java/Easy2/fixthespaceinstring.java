package Easy2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class fixthespaceinstring {
    public static String correctSpacing(String sentence) {
        String [] str = sentence.split(" ");
        return Arrays.stream(str)
                .filter(s -> s.trim().length() > 0)
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {

        String name = "The film   starts       at      midnight. ";
        String [] str = name.split(" ");
        String finalStr = Arrays.stream(str)
             .filter(s -> s.trim().length() > 0)
                .collect(Collectors.joining(" "));

        System.out.println(finalStr);
        for (String s:
             str) {
            System.out.println(s);
        }
    }
}
