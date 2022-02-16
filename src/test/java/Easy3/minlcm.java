package Easy3;

public class minlcm {
    public static int lcm(int n1, int n2) {
        if (n1 == 0 || n2 == 0) {
            return 0;
        }
        int higherNumber = Math.max(n1, n2);
        int lowerNumber = Math.min(n1, n2);
        int lcm = higherNumber;
        while (lcm % lowerNumber != 0) {
            lcm += higherNumber;
        }
        return lcm;
    }
// GCD is also same as GCF - Greatest common factor
    public static int gcd(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        System.out.println(lcm(9, 18));
        System.out.println(gcd(9,18));
    }
}
