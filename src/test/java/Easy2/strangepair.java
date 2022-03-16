package Easy2;

public class strangepair {
    public static boolean isStrangePair(String s1, String s2) {
        if(s1.length()==0 && s2.length()==0)
            return true;
        if(s1.length()==0 || s2.length()==0)
            return false;
        return (s1.substring(0,1).equalsIgnoreCase(s2.substring(s2.length()-1))
                 && s1.substring(s1.length()-1).equalsIgnoreCase(s2.substring(0,1)));
    }

    public static void main(String[] args) {

        System.out.println(isStrangePair("mentee", "eminem"));


    }
}
