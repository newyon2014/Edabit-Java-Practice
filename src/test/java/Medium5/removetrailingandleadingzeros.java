package Medium5;

public class removetrailingandleadingzeros {
    public static String removeLeadingTrailing(String n) {
        if(!n.contains("."))
            return n;
        StringBuilder sbLead = new StringBuilder(n);
        while (sbLead.length() > 0 && sbLead.charAt(0) == '0') {
            sbLead.deleteCharAt(0);
        }
        StringBuilder sbTrail = new StringBuilder(sbLead.toString());
        while (sbTrail.length() > 0 && (sbTrail.charAt(sbTrail.length() - 1) == '0' ))  {
            sbTrail.setLength(sbTrail.length() - 1);
        }
        if(sbTrail.toString().charAt(sbTrail.toString().length()-1)=='.')
            sbTrail.deleteCharAt(sbTrail.toString().length()-1);
     return sbTrail.toString();

    }
    public static void main(String[] args) {
        System.out.println(removeLeadingTrailing("0000.000"));
       /* StringBuilder sbLead = new StringBuilder(s);
        while (sbLead.length() > 0 && sbLead.charAt(0) == '0') {
            sbLead.deleteCharAt(0);
        }
        StringBuilder sbTrail = new StringBuilder(sbLead.toString());
        System.out.println(sbTrail.toString());
        while (sbTrail.length() > 0 && (sbTrail.charAt(sbTrail.length() - 1) == '0' ))  {
            sbTrail.setLength(sbTrail.length() - 1);
        }
        if(sbTrail.toString().charAt(sbTrail.toString().length()-1)=='.')
            sbTrail.deleteCharAt(sbTrail.toString().length()-1);
        System.out.println(sbTrail.toString());*/
    }
}
