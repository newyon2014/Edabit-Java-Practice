package Medium2;

public class transcribetomRNA {
    public static String dnaToRna(String strand) {
        char [] c = strand.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char ch:
             c) {
            if(ch=='A')
                sb.append('U');
            if(ch=='T')
                sb.append('A');
            if(ch=='G')
                sb.append('C');
            if(ch=='C')
                sb.append('G');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(dnaToRna("ATTAGCGCGATATACGCGTAC"));
    }
}
