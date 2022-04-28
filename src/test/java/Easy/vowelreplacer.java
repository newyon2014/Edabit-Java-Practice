package Easy;

public class vowelreplacer {

    public static String replaceVowels(String str, char ch) {

        return str.replaceAll("[aeiou]",Character.toString(ch));

    }

    public static void main(String[] args) {

                System.out.println(replaceVowels("shakespeare",'*'));

    }
}
