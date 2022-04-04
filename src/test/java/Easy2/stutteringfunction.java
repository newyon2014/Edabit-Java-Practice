package Easy2;

public class stutteringfunction {
    public static String stutter(String word) {

        return word.substring(0,2) + "..." + " " + word.substring(0,2) + "..." + " " + word+"?";
    }

    public static void main(String[] args) {
        System.out.println(stutter("incredible"));
    }
}
