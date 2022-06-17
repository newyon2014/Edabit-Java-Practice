package Medium2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class longestword {
    public static String longestWord(String phrase) {
       return Arrays.stream(phrase.split(" "))
                    .max(Comparator.comparing(s -> s.length()))
                    .get();
    }

    public static void main(String[] args) {
        String name = "Hello darkness my old friend.";

        Optional<String> str = Arrays.stream(name.split(" "))
                .max(Comparator.comparing(s -> s.length()));
        str.get();

    }
}
