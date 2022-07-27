package Medium5;

public class lengthofworm {
    public static String wormLength(String worm) {
        if(!(worm.replaceAll("[\\-]","").trim().length()==0) || worm.equals(""))
            return "invalid";
        return worm.length()*10 + " "+ "mm.";
    }

    public static void main(String[] args) {
        System.out.println(wormLength("QWERTYUIOPASDFGHJKL"));
    }
}
