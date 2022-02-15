package Easy4;

public class addingnumbers {
    public static String add(String a, String b)  {
        //a.equals("") || b.equals("") || a==null || b==null
        if (a == null || a == "" || b == null || b == "")
            return "Invalid Operation";

        return Integer.toString(Integer.parseInt(a) + Integer.parseInt(b));
    }

    public static void main(String[] args) {
        System.out.println(add("", "23"));

    }
}
