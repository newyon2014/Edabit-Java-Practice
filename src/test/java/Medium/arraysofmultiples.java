package Medium;

public class arraysofmultiples {
    public static int[] arrayOfMultiples(int num, int length) {
        int [] arrayMultiples = new int [length];
        int multiples = num;

        for (int i = 0; i < arrayMultiples.length; i++) {
            arrayMultiples[i] = num;
            num+=multiples;
        }
        return arrayMultiples;
    }

    public static void main(String[] args) {
        int [] array = arrayOfMultiples(7, 5);
        for (int i:
             array) {
            System.out.println(i);
        }

    }
}
