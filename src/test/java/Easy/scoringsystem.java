package Easy;

import java.util.Collection;

public class scoringsystem {

    public static int[] calculateScores(String str) {
        int [] score = new int[3];
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='A')
                score[0]++;
            if(str.charAt(i)=='B')
                score[1]++;
            if(str.charAt(i)=='C')
                score[1]++;
        }
        return score;
    }

    public static void main(String[] args) {

        System.out.println(calculateScores(""));


    }
}
