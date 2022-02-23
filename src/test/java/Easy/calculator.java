package Easy;

public class calculator {

    public static int calculator(int num1, char operator, int num2) {
        if (num2==0)
            return 0;


       switch (Character.toString(operator)) {
           case "+": return num1+num2;
           case "-": return num1-num2;
           case "*": return num1*num2;
           case "/": return num1/num2;
       }
       return 0;
    }

    public static void main(String[] args) {

        System.out.println(calculator(3, '*', 2));

    }
}
