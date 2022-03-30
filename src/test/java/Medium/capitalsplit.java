package Medium;

public class capitalsplit {
    public static String capSpace(String txt) {
        String finalString = "";
        for (int i = 0; i < txt.length(); i++) {
            if(Character.isUpperCase(txt.charAt(i)))
                finalString+= " " + Character.toLowerCase(txt.charAt(i));
            else
                finalString+=Character.toLowerCase(txt.charAt(i));
        }
        return finalString;
    }

    public static void main(String[] args) {
        String str = "iLoveMyTeapot";
        System.out.println(str.replaceAll("([A-Z])", " $1").toLowerCase());
        System.out.println(str.replaceAll("([aeiou])" ,"-$1-"));



        System.out.println(capSpace(str));
    }
}
