package Easy;

public class amplifymultipleoffour {
    public static int[] amplify(int num) {
        int [] finalArray = new int[num];

        for (int i = 0; i < finalArray.length; i++) {
            if(i%4!=0)
                finalArray[i]=i;
            else
                finalArray[i]=10*i;
        }
        return finalArray;
    }

    public static void main(String[] args) {



    }
}
