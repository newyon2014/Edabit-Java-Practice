package Medium4;

public class nthtermofthesequence {

    public static int seq(int n) {
       int counter = 1;
       int base = 1;
       int seed = 0;
        if(n==1)
            return 2;
         if(n==2)
            return 6;
         while (counter < n){
             seed+=3;
             counter++;
         }
         base = base*(n-2)*4;
        System.out.println(base);
        System.out.println(seed);
         seed = seq(2) + base + seed;

        return seed;

    }

    public static void main(String[] args) {
        System.out.println(seq(5));
    }
}
