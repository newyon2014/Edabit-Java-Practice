package Easy3;

public class exponentialwithlogarithm {
    public static int solveForExp(int a, int b) {
        int pow = 0;
        while(b > 1){
            b=b/a;
            pow++;
            System.out.println(b);
            System.out.println(pow);
        }
        return pow;
    }

    public static void main(String[] args) {
        System.out.println(solveForExp(9, 348678));
    }

}
