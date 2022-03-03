package Medium4;

import java.util.Arrays;

public class countlettersinwordsearch {
    public static int letterCounter(char[][] arr, char c) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==c){
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        String num = "000020";
        System.out.println(Integer.parseInt("000020"));
        System.out.println(letterCounter(new char[][]{
                {'D', 'E', 'Y', 'H', 'A', 'D'},
                {'C', 'B', 'Z', 'Y', 'J', 'K'},
                {'D', 'B', 'C', 'A', 'M', 'N'},
                {'F', 'G', 'G', 'R', 'S', 'R'},
                {'V', 'X', 'H', 'A', 'S', 'S'}
        },'D'));
    }

}
