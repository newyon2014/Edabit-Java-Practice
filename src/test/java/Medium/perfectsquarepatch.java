package Medium;

import java.util.Arrays;

public class perfectsquarepatch {
    public static int[][] squarePatch(int n) {
        int [][] squareArray = new int [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                squareArray[i][j] = n;
            }
        }
        return squareArray;

    }

    public static void main(String[] args) {



    }
}
