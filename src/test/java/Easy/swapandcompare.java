package Easy;

public class swapandcompare {
    public static boolean largestSwap(int num) {
         return (Integer.parseInt((new StringBuilder(String.valueOf(num)).reverse().toString())) <= num)? true :false;
    }

    public static void main(String[] args) {
        System.out.println(largestSwap(14));


    }
}
