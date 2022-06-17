package Medium2;

public class numberofboomerang {
    public static int countBoomerangs(int[] arr) {
        int lastIndex = 2;
        int boomerangCount = 0;

        for (int firstIndex = 0; lastIndex < arr.length; firstIndex++,lastIndex++) {
            if((arr[firstIndex]==arr[lastIndex])&& (arr[firstIndex]!=arr[lastIndex-1]))
                boomerangCount++;
        }
        return boomerangCount;
    }

    public static void main(String[] args) {
        System.out.println(countBoomerangs(new int [] {4, 4, 4, 9, 9, 9, 9}));

    }
}
