package Medium6;

import java.util.Arrays;

public class peelingofftheouterlayers {

    public static Object[][] peelLayer(Object[][] arr) {
        if(arr.length < 2)
            return new Object[][] {{}};
        Object [][] peeled = new Object [arr.length-2][arr[1].length-2];
        for (int i = 1; i < arr.length-1; i++) {
            for (int j = 1; j < arr[0].length-1; j++) {
                peeled[i-1][j-1] = arr[i][j];
            }
        }
        return peeled;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(peelLayer(new Object [][]{{true, false, true},{false, false, true},{true, true, true}})));

        Object [][] alphabets = {{'a', 'b', 'c', 'd','e'},
                {'e', 'f', 'g', 'h'},
                {'i', 'j', 'k', 'l'},
                {'m', 'n', 'o', 'p'}};

        System.out.println(alphabets);
    }
}
