package Medium5;

import java.util.Stack;

public class iscenter {
    public static boolean isCentered(String str) {
            String [] arr = str.split("[^\\s]");
        System.out.println(arr.length);
    return (arr.length==0?true:arr.length==1?false:(str.split("[^\\s]")[0].length() == str.split("[^\\s]")[1].length()));
    }

    public static void main(String[] args) {
        System.out.println(isCentered("7 "));
    }
}
