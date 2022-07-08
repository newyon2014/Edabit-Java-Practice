package Medium2;

public class timetofinish {
    public static int timeToFinish(String full, String part) {
        return (full.substring(part.length()).trim()).replaceAll("\\s","").length()/2;

    }

    public static void main(String[] args) {
        String s1 = "And so brings my conclusion to its conclusion.";
        String s2 = "And so brings my conclusion to its conclus";
        String str3 = s1.substring(s2.length()).trim();
        System.out.println(str3);
        str3.replaceAll("\\s","");
        System.out.println(str3.replaceAll("\\s","").length());
    }
}
