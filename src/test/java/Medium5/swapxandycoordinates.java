package Medium5;

public class swapxandycoordinates {
    public static String swapXY(String str) {
        return str.replaceAll("\\((-?\\d+)\\,\\s(-?\\d+)\\)\\,\\s\\((-?\\d+)\\,\\s(-?\\d+)\\)" , "($2, $1), ($4, $3)");

    }

    public static void main(String[] args) {
        String name = "(1, 2), (3, 4)";

        System.out.println(name.replaceAll("\\((\\d).\\s(\\d)\\)\\,\\s\\((\\d).\\s(\\d)\\)" , "($2, $1), ($3, $4)"));
    }
}
