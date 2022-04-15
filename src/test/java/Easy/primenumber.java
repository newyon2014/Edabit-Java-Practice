package Easy;

public class primenumber {

    public static boolean PrimeNumberInRange(int n1, int n2) {
        for (int i = n1; i <=n2 ; i++) {
            if(isPrime(i))
                return true;
            else
                continue;
            }
        return false;
    }

    public static boolean isPrime (int number){
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (number % i == 0) {
                // number is perfectly divisible - no prime
                return false;
            }
        }
        return true;
    }
        public static void main (String[] args){

            System.out.println(PrimeNumberInRange(10, 15)); //➞ (true)
// Prime numbers in range: 11, 13

            System.out.println(PrimeNumberInRange(62, 66));// ➞ (false)
// No prime numbers in range.

            PrimeNumberInRange(3, 5);// ➞ (true)
// Prime numbers in range: 3, 5

        }
    }

