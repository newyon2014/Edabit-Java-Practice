package Easy;

public class symmetricalornot {
    public static boolean isSymmetrical(int num) {
        return (new StringBuilder(String.valueOf(num)).reverse().toString().equals(String.valueOf(num)));

    }

    public static void main(String[] args) {

    }
}
