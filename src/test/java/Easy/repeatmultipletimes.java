package Easy;

public class repeatmultipletimes {

    public static String repeat(String str, int n) {

        String finalString = " ";

        for (int i = 0; i <str.length() ; i++) {
            for (int j = 0; j < n; j++) {
                finalString+=str.charAt(i);
            }
        }
        return finalString;
    }

    public static void main(String[] args) {

        System.out.println(repeat("mice", 5));

    }
}
