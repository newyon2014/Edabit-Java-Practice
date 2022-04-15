package Easy;

public class suffixvsprefix {

    public static boolean isPrefix(String word, String prefix) {
        return word.substring(0,prefix.length()-1).equals(prefix.substring(0,prefix.length()-1));
    }

    public static boolean isSuffix(String word, String suffix) {
       return  word.substring(word.length()-suffix.substring(1).length()).equals(suffix.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(isSuffix("arachnophobia", "-phobia"));

    }
}
