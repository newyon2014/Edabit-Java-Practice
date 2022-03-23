package Easy;

public class MostLeftDigit {
    public static int leftDigit(String str) {

        for (char c: str.toCharArray()) {
            if (Character.isDigit(c))
                return Integer.parseInt(Character.toString(c));
        }

        return 0;

    }
    public static void main(String[] args) {

        System.out.println(leftDigit("TrAdE2W1n95!"));

    }
}


