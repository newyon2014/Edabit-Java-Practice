package Easy2;

public class sameASCIIorNOT {
    public static boolean sameAscii(String a, String b) {
        int asciiOfa=0,asciiOfb = 0;

        for (int i = 0; i < a.length(); i++) {
            asciiOfa+= (int) a.charAt(i);
        }
        for (int i = 0; i < b.length(); i++) {
            asciiOfb+= (int) b.charAt(i);
        }
        return (asciiOfa==asciiOfb);
    }

    public static void main(String[] args) {

    }
}
