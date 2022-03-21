package Easy;

public class halfandthenhalf {
    public static int halveCount(int a, int b) {
        int halfCounter=0;

        while (a > b){
            a/=2;
            halfCounter++;
            System.out.println("Value of a  " + a);
            System.out.println("Value of this counter  " + halfCounter);
        }
        return halfCounter-1;
    }



    public static void main(String[] args) {
        System.out.println(halveCount(4469, 5));

    }
}
