package Medium4;

public class pythagoreantriplet {
    public static boolean isTriplet(int a, int b, int c) {
        int max = Math.max(Math.max(a,b),c);
        if(a >= max)
            return Math.pow(b,2)+ Math.pow(c,2) == Math.pow(a,2);
        if(b >= max)
            return Math.pow(a,2)+ Math.pow(c,2) == Math.pow(b,2);

        return Math.pow(a,2)+ Math.pow(b,2) == Math.pow(c,2);
    }

    public static void main(String[] args) {
        System.out.println(isTriplet(3, 4, 5));
    }

}
