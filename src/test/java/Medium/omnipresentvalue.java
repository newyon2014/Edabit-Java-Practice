package Medium;

import java.util.Arrays;

public class omnipresentvalue {
    public static boolean omnipresent(int[][] arr, int val) {

        return Arrays.stream(arr).allMatch(x -> Arrays.stream(x).filter(y -> y==5).count()>0);
    }

    public static void main(String[] args) {
        System.out.println(omnipresent(
                new int[][]{{5}, {5}, {5}, {6, 5}}, 5
        ));
        int [][] arrExample = new int[][]{{5}, {5}, {5}, {6, 5}};
        }
    }

