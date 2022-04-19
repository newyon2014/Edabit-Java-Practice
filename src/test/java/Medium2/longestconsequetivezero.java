package Medium2;


public class longestconsequetivezero {
    public static String longestZero(String str) {
        int maxZeros = 0;
        int currentCount = 0;
        String maxzeroString = "";
        char [] c = str.toCharArray();
        for (char ch:
             c) {
            if (ch=='0'){
                currentCount++;
                maxZeros = Math.max(maxZeros,currentCount);
            } else
                currentCount=0;
        }
        for (int i = 0; i < maxZeros; i++) {
            maxzeroString+="0";
        }
        return maxzeroString;
    }

    public static void main(String[] args) {
        System.out.println(longestZero("01100001011000"));
    }
}
