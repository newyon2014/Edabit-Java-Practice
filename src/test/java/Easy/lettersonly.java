package Easy;

public class lettersonly {
    public static String lettersOnly(String str) {

        return str.replaceAll("[^A-Za-z']","").trim();

    }

    public static void main(String[] args) {

        System.out.println(lettersOnly("R!=:~0o0./c&}9k`60=y"));

    }
}
