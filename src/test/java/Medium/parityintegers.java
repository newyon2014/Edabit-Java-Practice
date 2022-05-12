package Medium;

public class parityintegers {

    public static boolean parityAnalysis(int num) {
        int sumOfDigits = 0;
        char[] c = String.valueOf(num).toCharArray();

        for (int i = 0; i < c.length; i++) {
            sumOfDigits+=Integer.parseInt(Character.toString(c[i]));
        }
        if((num%2!=0 && sumOfDigits%2!=0) || (num%2==0 && sumOfDigits%2==0))
            return true;

        return false;
    }

    public static void main(String[] args) {
        System.out.println(parityAnalysis(3));
    }
}
