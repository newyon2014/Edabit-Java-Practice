package Easy;

public class integerorstring {

    public static String intOrString(Object var) {

        if (var.equals((int)var))
            return "int";

        return "str";

    }

    public static void main(String[] args) {

        int number = 8;
        String name = "hello";
        int longNumber = 9843532;


    }
}
