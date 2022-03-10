package Medium;

public class firstprimorial {

    public static int primorial(int n) {
        int primorialValue = 1, factor = 1;
        while ( n != 0){
            factor ++;
            boolean isPrime = true;
            for (int i = 2; i < factor; i++) {
                if (factor % i==0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                n--;
                primorialValue *= factor;
            }
        }
        return primorialValue;
    }
}
