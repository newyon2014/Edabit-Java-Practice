package Easy3;

public class fizzbuzz {
    public static String fizzBuzz(int n) {
        if(n%3==0)
            return "Fizz";
        if(n%5==0)
            return "Buzz";
        if(n%3==0 && n%5==0)
            return "FizzBuzz";

        return Integer.toString(n);
    }

    public static void main(String[] args) {

    }
}
