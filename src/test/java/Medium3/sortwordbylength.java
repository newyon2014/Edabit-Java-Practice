package Medium3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sortwordbylength {
    public static String sortByLength(String str) {
        return Arrays.stream(str.split("\\s"))
                .sorted((s1, s2) -> s1.compareToIgnoreCase(s2))
                .sorted((s1, s2) -> s1.length() - s2.length())
                .collect(Collectors.joining(" "));
    }


    public static void main(String[] args) {
        System.out.println(sortByLength("He ay friend"));
        String name = "a if of are can two dead keep them Three secret,";
       // Collections.sort(name.split(" ").to);
    }
}
