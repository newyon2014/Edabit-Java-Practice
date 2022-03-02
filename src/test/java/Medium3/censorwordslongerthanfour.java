package Medium3;

import java.util.Arrays;

public class censorwordslongerthanfour {
    public static String censor(String str) {
        String [] arr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length() <= 4)
                sb.append(arr[i]).append(" ");
            else {
                int repeatChar = arr[i].length();
                while(repeatChar > 0){
                    arr[i]=arr[i].replace(arr[i],"*");
                    sb.append(arr[i]);
                    repeatChar--;
                }
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(censor("The code is fourty"));

    }
}
