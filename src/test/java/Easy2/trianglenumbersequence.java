package Easy2;

public class trianglenumbersequence {
    public static int triangle(int n) {
        int numberOfDot = 1;
        int dotCounter = 2;
        for (int i = 1; i < n; i++) {
            numberOfDot+=dotCounter;
            dotCounter++;
        }
        return numberOfDot;
    }

    public static void main(String[] args) {
        System.out.println(triangle(6));
    }
}
