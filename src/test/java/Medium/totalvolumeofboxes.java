package Medium;

public class totalvolumeofboxes {
    public static int totalVolume(int[][] part) {
        int sumTotalInner=1;
        int sumTotalOuter=0;
        for (int i = 0; i < part.length; i++) {
            for (int j = 0; j < part[i].length; j++) {
                sumTotalInner *= part[i][j];
            }
            sumTotalOuter+=sumTotalInner;
            sumTotalInner=1;
        }
        return sumTotalOuter;
    }

    public static void main(String[] args) {
        System.out.println(totalVolume(new int [][] {{ 4, 2, 4 }, { 3, 3, 3 }, { 1, 1, 2 }, { 2, 1, 1 }}));

    }
}
