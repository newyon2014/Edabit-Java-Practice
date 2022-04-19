package Medium;

public class reverseabinarystring {

    public static int reversedBinaryInteger(int n) {
        return Integer.parseInt(new StringBuilder(Integer.toBinaryString(n)).reverse().toString(),2);
    }

    public static void main(String[] args) {

        System.out.println(reversedBinaryInteger(10));
    }

}
