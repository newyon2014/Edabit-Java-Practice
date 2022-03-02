package Easy3;

public class Collatzconjecture {
    public static int collatzConjecture(int n) {
        int steps = 0;
        while (n>1){
            if(n%2==0){
                n=n/2;
                steps++;
            }else{
                n=n*3+1;
                steps++;
            }
        }
        return steps;
    }

    public static void main(String[] args) {
        System.out.println(collatzConjecture(345));
    }
}
