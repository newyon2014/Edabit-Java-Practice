package Medium5;

public class harshadnumber {
    public static boolean isHarshad(int n) {
        int sum = 0;
        int num =n;
        while (num!=0){
            sum+=num%10;
            num=num/10;
        }
       return n%sum==0;
    }

    public static void main(String[] args) {
        System.out.println(isHarshad(89));

    }
}
