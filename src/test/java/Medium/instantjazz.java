package Medium;

public class instantjazz {
    public static String[]  jazzify(String[] arr) {
        String [] finalArray = new String [arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].contains("7"))
                finalArray[i]=arr[i];
            else
                finalArray[i]=arr[i].concat("7");
        }
        if(arr.length==0)
            return new String[]{};

        return finalArray;
    }

    public static void main(String[] args) {

    }
}
