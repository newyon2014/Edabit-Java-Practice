package Easy;

import java.util.Arrays;
import java.util.List;

public class maxtotalfive {

    public static int maxTotal(int[] nums) {
        int topFiveSum = 0;
        Arrays.sort(nums);
          for (int i = nums.length/2; i < nums.length; i++) {
            topFiveSum += nums[i];
        }
        return topFiveSum;
    }

    public static void main(String[] args) {
            System.out.println(maxTotal(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));

        }
    }

