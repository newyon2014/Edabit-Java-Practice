package Medium;

public class functionator8000 {
    public static String inatorInator(String inv) {
        String vowels = "aeiou";

        if(Character.toString(inv.charAt(inv.length()-1)).equalsIgnoreCase("a") ||
          Character.toString(inv.charAt(inv.length()-1)).equalsIgnoreCase("e") ||
          Character.toString(inv.charAt(inv.length()-1)).equalsIgnoreCase("i" )||
          Character.toString(inv.charAt(inv.length()-1)).equalsIgnoreCase("o") ||
          Character.toString(inv.charAt(inv.length()-1)).equalsIgnoreCase("u" ))
            return new StringBuilder(inv).append("-inator").append(" ").append(String.valueOf(inv.length()*1000)).toString();
        else
            return new StringBuilder(inv).append("inator").append(" ").append(String.valueOf(inv.length()*1000)).toString();

    }
}
