package Easy;

public class reverseString {

    public static void main(String[] args) {
        String finalString = "";

        String reverse = "Hello World";
        //String[] word = reverse.split(" ");

         StringBuilder sb = new StringBuilder(reverse);

        System.out.println(sb.reverse().toString());


        }

    }

