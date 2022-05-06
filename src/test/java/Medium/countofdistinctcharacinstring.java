package Medium;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class countofdistinctcharacinstring {
    public static int duplicates(String str) {
        System.out.println(Stream.of(str).distinct().count());
      //  System.out.println(str.length());
        //System.out.println(Arrays.asList(str).stream().distinct().collect(Collectors.joining("")));

        return str.length() - Arrays.asList(str).stream().distinct().collect(Collectors.joining()).length();

    }

    public static void main(String[] args) {
        System.out.println(duplicates("Hello World!"));

    }
}
