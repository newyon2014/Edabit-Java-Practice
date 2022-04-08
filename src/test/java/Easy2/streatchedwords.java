package Easy2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streatchedwords {
    public static String unstretch(String word) {
        return word.replaceAll("([a-zA-Z])\\1+", "$1");
    }

    public static void main(String[] args) {
        System.out.println(unstretch("ppoeemm"));
    }
}
