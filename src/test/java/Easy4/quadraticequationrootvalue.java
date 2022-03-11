package Easy4;

public class quadraticequationrootvalue {
    public static int quadraticEquation(int a, int b, int c) {
        int discriminant = (int) Math.pow(b,2) - 4*a*c;
        return (int) (((-1*b)+Math.sqrt(discriminant))/(2*a));
    }

    public static void main(String[] args) {
        System.out.println(quadraticEquation(2, -7, 3));
    }


}
