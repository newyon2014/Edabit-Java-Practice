package Easy;

public class repeatingLetters {

    public static void main(String[] args) {

        String string = "Hello World!";
       String duplicate = " ";

        for (int i = 0; i < string.length(); i++) {
            duplicate += "" + string.charAt(i) + string.charAt(i);
        }

        System.out.println(duplicate);
    }
}
