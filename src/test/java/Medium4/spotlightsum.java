package Medium4;

public class spotlightsum {
    public static int spotlightSum(int n) {
        int iIndex = 0;
        int jIndex = 0;
        int spotLightSum = 0;
        int[][] spotArray = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
                {41, 42, 43, 44, 45, 46, 47, 48, 49, 50},
                {51, 52, 53, 54, 55, 56, 57, 58, 59, 60},
                {61, 62, 63, 64, 65, 66, 67, 68, 69, 70},
                {71, 72, 73, 74, 75, 76, 77, 78, 79, 80},
                {81, 82, 83, 84, 85, 86, 87, 88, 89, 90},
                {91, 92, 93, 94, 95, 96, 97, 98, 99, 100}

        };
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (spotArray[i][j] == n){
                    iIndex = i;
                    jIndex = j;
                }
            }
        }
        spotLightSum = spotArray[iIndex - 1][jIndex - 1] + spotArray[iIndex - 1][jIndex] + spotArray[iIndex - 1][jIndex + 1] +
                spotArray[iIndex][jIndex - 1] + spotArray[iIndex][jIndex + 1] +
                spotArray[iIndex + 1][jIndex - 1] + spotArray[iIndex + 1][jIndex] + spotArray[iIndex + 1][jIndex + 1] +
                spotArray[iIndex][jIndex];

        return spotLightSum;
    }

    public static void main(String[] args) {
        System.out.println(spotlightSum(88));
    }

}
