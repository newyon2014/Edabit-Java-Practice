package Medium4;


import java.util.stream.IntStream;

public class missingletters {
    public static String getMissing(String strLetters) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String missingAlpha = "";
        for (int i = 0; i < alpha.length(); i++) {
            if(!strLetters.contains(Character.toString(alpha.charAt(i))))
                missingAlpha+=alpha.charAt(i);
        }
        return missingAlpha;
    }
    public static void main(String[] args) {
        System.out.println(getMissing("abcdefgpqrstuvwxyz"));

        String strLetters = "zyxwvutsrq";
        IntStream.rangeClosed('a','z')
                .mapToObj(c -> Character.toString((char)c))
                .filter(c -> !strLetters.contains(c))
                .reduce(String::concat)
                .orElse(" ");

    }
}
