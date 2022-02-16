package Easy4;

public class quadraticsolution {
    public static int solutions(int a, int b, int c) {
       int discriminant = (int) Math.pow(b,2) - 4*a*c;
       return discriminant < 0? 0: discriminant > 0? 2: 1;
    }

    public static void main(String[] args) {
        System.out.println(solutions(200, 420, -800));
    }
}
