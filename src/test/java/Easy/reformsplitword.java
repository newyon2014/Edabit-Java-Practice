package Easy;

public class reformsplitword {

    public static String getWord(String left, String right) {

        return left.substring(0,1).toUpperCase() + left.substring(1) + right;

    }

    public static void main(String[] args) {

        String str1 = "seas";
        String str2 = "onal";
        String finalStr = str1.substring(0,1).toUpperCase() + str1.substring(1) + str2;

        System.out.println(finalStr);
    }
}
