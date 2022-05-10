package Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class dashedvowels {
    public static String dashed(String s) {
        String str = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c =='i' || c == 'o' || c =='u' || c =='A' || c =='E' || c == 'I' || c =='O' || c =='U'){
                str += ("-" + c + "-");
            } else{
                str += c;
            }
        }
        return str;
    }
        public static void main (String[]args){
            String str = "Edabit";
            System.out.println(dashed("Edabit"));
    }
}


