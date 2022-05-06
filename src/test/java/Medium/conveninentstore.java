package Medium;

public class conveninentstore {

    public static boolean changeEnough(int[] change, double amountDue) {
        double totalChangeInPocket = (double) change[0] / 4 + (double) change[1] /10 + (double) change [2] / 20 + (double) change[3] /100;
        System.out.println(totalChangeInPocket);
        return totalChangeInPocket >= amountDue;
    }

    public static void main(String[] args) {

        System.out.println(changeEnough(new int[] { 1, 335, 0, 219} ,  35.21));

    }
}
