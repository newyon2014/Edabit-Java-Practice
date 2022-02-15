package Easy2;

public class binaryrepresentation {
    public static int countOnes(int n) {
        System.out.println(Integer.toBinaryString(n));

        return Integer.toBinaryString(n).replaceAll("0", "").trim().length();
    }

    public static void main(String[] args) {
        System.out.println(countOnes(999));
    }
}
