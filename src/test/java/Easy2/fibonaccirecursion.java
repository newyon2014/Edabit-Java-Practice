package Easy2;

public class fibonaccirecursion {

    // xn = x(n-1) + x(n-2)

    public static int Fibonacci(int a) {
        if (a<=1)
            return 1;

        return Fibonacci(a-1) + Fibonacci(a-2);
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(7));
    }

}
