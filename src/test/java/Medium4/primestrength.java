package Medium4;

public class primestrength {
    public static boolean isPrime(int number) {
        if (number <= 2)
            return false;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static String primalStrength(int n) {
        int previous_prime = n - 1;
        int next_prime = n + 1;

        while (!isPrime(next_prime))
            next_prime++;

        while (!isPrime(previous_prime))
            previous_prime--;

        int mean = (previous_prime + next_prime) / 2;

        return n==mean?"Balanced":n > mean?"Strong":"Weak";
    }
    public static void main(String[] args) {
        System.out.println(primalStrength(17));

    }
}
