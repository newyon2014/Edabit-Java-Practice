package Medium;

public class warofnumbers {

    public static int warOfNumbers(int[]numbers){
        int sumOfOdds = 0;
        int sumOfEven = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%2==0)
                sumOfEven+= numbers[i];
            else
                sumOfOdds+= numbers[i];
        }

        if(sumOfEven > sumOfOdds)
            return sumOfEven-sumOfOdds;

        return (sumOfOdds-sumOfEven);
    }

    public static void main(String[] args) {
        System.out.println(new int[]{2, 8, 7, 5});
    }
}
