package Medium5;

public class longestcommonending {
    public static String longestCommonEnding(String str1, String str2) {
        String lce = "";
        int index = 1;
        if(str1.length() > str2.length()){
            lce = str2;
            while(lce.length()!=0){
                if(str1.endsWith(lce))
                    break;
                else
                    lce = lce.substring(index);
            }
        }
        else {
            lce = str1;
            while(lce.length()!=0){
                if(str2.endsWith(lce))
                    break;
                else
                    lce = lce.substring(index);
            }
        }
       return lce;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonEnding("multiplication", "ration"));
       /* String s1 = "multiplication";
        String s2 = "ration";

        System.out.println(s1.endsWith(s2));*/
    }
}
