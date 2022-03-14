package Easy2;

public class stripsentence {
    public static String stripSentence(String str, String chars) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(!chars.contains(Character.toString(str.charAt(i))) ||
                    Character.toString(str.charAt(i)).length()==0)
                sb.append(str.charAt(i));
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {

    }
}
