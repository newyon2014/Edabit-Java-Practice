package Easy;

public class stringisapalindrome {
    public static boolean isPalindrome(String str) {


        return (new StringBuilder(str.replaceAll("[^a-zA-z]","")).reverse().toString().trim()
                    .equalsIgnoreCase(str.replaceAll("[^a-zA-z]","").trim()))?true:false;
    }

    public static void main(String[] args) {

    }
}
