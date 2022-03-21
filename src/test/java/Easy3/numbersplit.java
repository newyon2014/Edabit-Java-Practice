package Easy3;

public class numbersplit {
    public static int[] numberSplit(int n) {
        if(n%2==0)
            return new int [] {n/2,n/2};
        if(n%2!=0 && n>0)
            return new int [] {(int)Math.floor(n/2),(int) Math.round((double)n/2)};

        else
           return new int [] {(int)Math.round(Math.abs((double)n/2))*(-1),(int)Math.floor(Math.abs(n/2)*(-1))};
    }

    public static void main(String[] args) {
        int [] splitArr = numberSplit(-9);
        for (int i:
             splitArr) {
            System.out.println(i);
        }
    }

}
