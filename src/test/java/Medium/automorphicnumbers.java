package Medium;

public class automorphicnumbers {
    public static boolean isAutomorphic(int n) {

        String square = String.valueOf((long)n*n);
        String nStr = String.valueOf(n);
        return square.endsWith(nStr);
    }

    public static void main(String[] args) {
        System.out.println(isAutomorphic(7109376));

    }

}
