package Medium5;

import java.util.Stack;

public class isFactorialornot {
    public static boolean isFactorial(int n) {
        boolean isFactorial = false;
        if(n==2)
            isFactorial = true;
        int ofFactorial = 1;
          while(ofFactorial <= n/2){
             if(factorial(ofFactorial)==n){
                 isFactorial=true;
                 break;
             }
              ofFactorial++;
       }
       return isFactorial;
    }
    public static int factorial(int n){
        if(n<1)
            return 1;
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(isFactorial(24));


    }
}
