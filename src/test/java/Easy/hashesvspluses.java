package Easy;

public class hashesvspluses {

    public static int[] hashPlusCount(String s) {

        int hashesCount= 0;
        int plusCount= 0;

        if (s.length()==0)
            return new int[]{0,0};

        for (int i = 0; i < s.length(); i++) {
            if(Character.toString(s.charAt(i)).equals("+"))
                plusCount++;
            else
                hashesCount++;
        }

        return new int[]{hashesCount,plusCount};

    }

    public static void main(String[] args) {


    }
}
