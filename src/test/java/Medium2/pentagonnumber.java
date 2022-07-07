package Medium2;

public class pentagonnumber {
    public static int pentagonal(int num) {
        int totalDots = 1;
        if(num==1)
            return totalDots;

        for (int i = 1; i < num; i++) {
            totalDots+=i*5;
        }
        return totalDots;
    }

    public static void main(String[] args) {
        System.out.println(pentagonal(43));
    }
}
