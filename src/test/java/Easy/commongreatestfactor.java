package Easy;

public class commongreatestfactor {

    public static int gcd(int n1, int n2) {
        System.out.println("Value of n1  " + n1 + "  Value of n2  "+ n2);

        if (n2 == 0)
            return n1;
        return gcd(n2, n1 % n2);

    }

    public static void main(String[] args) {

        System.out.println(gcd(8, 12));

    }
}
