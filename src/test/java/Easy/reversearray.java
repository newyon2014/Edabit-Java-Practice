package Easy;

public class reversearray {
    public static int[] reverse(int[] arr) {
        int [] reverseArray = new int[arr.length];
        for (int i = 1; i <= arr.length; i++) {
            reverseArray[i-1]=arr[arr.length-i];
        }
        return reverseArray;
    }

    public static void main(String[] args) {

    }

}
