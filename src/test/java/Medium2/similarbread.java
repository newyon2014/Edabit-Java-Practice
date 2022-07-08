package Medium2;

public class similarbread {
    public static boolean hasSameBread(String[] a, String[] b) {
        if(a[0].equalsIgnoreCase(b[0]) && a[2].equalsIgnoreCase(b[2]))
            return true;

        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSameBread(new String [] {"white bread", "lettuce", "white bread"},new String [] {"white bread", "tomato", "white bread"}));
    }
}
