package Easy;

public class checkEnding {

    public static boolean checkEnding(String str1, String str2) {

     return str1.endsWith(str2);
    }

    public static void main(String[] args) {

        System.out.println(checkEnding("bc", "bc"));

        System.out.println(checkEnding("abc", "d"));

        System.out.println(checkEnding("samurai", "zi"));

        System.out.println(checkEnding("feminine", "nine"));

        System.out.println(checkEnding("convention", "tio"));

    }
}
