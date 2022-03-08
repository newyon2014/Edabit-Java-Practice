package Medium;

public class reversenumber {
    public static String rev(int n) {

        return new StringBuilder(String.valueOf(Math.abs(n))).reverse().toString();

    }
}
