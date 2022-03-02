package Easy;

public class compareThree {

    public static int equal(int a, int b, int c) {
        int counter = 0;
        if(a==b || a==c )
            counter++;
        if(b==a || b==c)
            counter++;
        if(c==a || c==b)
            counter++;
        return counter;
    }

    public static void main(String[] args) {

    }
}
