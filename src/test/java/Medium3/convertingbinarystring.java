package Medium3;

public class convertingbinarystring {
    public static int minSwaps(String s1, String s2) {
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                count++;
        }

/*        // If counter is even print the swap
        if (count % 2 == 0)
            System.out.println(count / 2);
        else
            System.out.println("Not Possible");*/
        return count/2;

    }

    public static void main(String[] args) {
        System.out.println(minSwaps("10011001", "01100110"));
    }
}
