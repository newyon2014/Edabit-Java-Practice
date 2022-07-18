package Medium3;

public class sumoftwonumbersonthemoon {
    public static int lunarSum(int number1, int number2) {
        String num1 = Integer.toString(number1);
        String num2 = Integer.toString(number2);
        int len = Math.max(num1.length(), num2.length());
        int[] num1Array = new int[len];
        int[] num2Array = new int[len];
        int [] finalArray = new int [len];
        String finalNum = "";

        for (int i = num1.length()-1,j=1; 0 <= i; i--,j++)
            num1Array[num1Array.length-j] = Integer.valueOf(Character.toString(num1.charAt(i)));

        for (int i = num2.length()-1,j=1; 0 <= i; i--,j++)
            num2Array[num2Array.length-j] = Integer.valueOf(Character.toString(num2.charAt(i)));

        for (int i = 0; i < finalArray.length; i++)
            if(num1Array[i] > num2Array[i])
                finalArray[i] = num1Array[i];
            else
                finalArray[i] = num2Array[i];
        for (int i :
                finalArray) {
            finalNum+=i;
        }
            return Integer.valueOf(finalNum);
        }
    public static void main (String[]args){
        System.out.println(lunarSum(36602, 696));
    }
}

