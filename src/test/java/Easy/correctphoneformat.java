package Easy;

public class correctphoneformat {
    public static boolean isValidPhoneNumber(String s) {



          return (s.matches("\\(\\d{3}\\)\\s\\d{3}\\-\\d{4}"));

    }



    public static void main(String[] args) {

        System.out.println(isValidPhoneNumber("(123) 456-7890"));

        String alphabets = "abcdefg";
        int totalSum = 0;
        for (int i = 0; i < alphabets.length(); i++) {
            totalSum+=alphabets.indexOf(alphabets.charAt(i)) +1;

        }

        System.out.println(totalSum);
    }
}
