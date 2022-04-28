package Easy3;

public class thereverser {

    //reverse the char
    //reverse the case
    public static String reverse(String text) {
        String finalString = "";
        for (char c:
                new StringBuilder(text).reverse().toString().toCharArray()) {
            if(Character.isUpperCase(c))
                finalString+=Character.toLowerCase(c);
            else
                finalString+=Character.toUpperCase(c);
        }
        return finalString;
    }

    public static void main(String[] args) {

        String reverse = "Hello World";
        StringBuilder sb = new StringBuilder(reverse);
        System.out.println(sb.reverse().toString());
        String finalString = "";

        for (char c:
             new StringBuilder(reverse).reverse().toString().toCharArray()) {
            if(Character.isUpperCase(c))
                finalString+=Character.toLowerCase(c);
            else
                finalString+=Character.toUpperCase(c);
        }
        System.out.println(finalString);
    }
}
