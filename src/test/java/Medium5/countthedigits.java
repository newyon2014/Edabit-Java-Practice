package Medium5;

public class countthedigits {
    public static int digitsCount(long n) {
        int count = 0;
        if (n==0)
            count = 1;

        while (Math.abs(n) > 0){
            n=n/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(digitsCount(12345));
    }
}
