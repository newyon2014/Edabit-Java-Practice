package Medium;

public class rockpaperscissors {
    public static String rps(String s1, String s2) {
        if(s1.equals("rock") && s2.equals("scissors")){
            return "Player 1 wins";
        } else if (s1.equals("scissors") && s2.equals("rock")){
            return "player 2 wins";
        }
        if(s1.equals("paper") && s2.equals("rock")){
            return "Player 1 wins";
        } else if (s1.equals("rock") && s2.equals("paper")){
            return "player 2 wins";
        }
        if(s1.equals("scissors") && s2.equals("paper")){
            return "Player 1 wins";
        } else if (s1.equals("paper") && s2.equals("paper")){
            return "player 2 wins";
        }
        return "TIE";
    }
}
