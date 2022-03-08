package Easy4;

public class spinaroundtouchtheground {
    public static int spinAround(String[] turns) {
        int rightCounter = 0;
        int leftCounter = 0;
        for (int i = 0; i < turns.length; i++) {
            if(turns[i].equalsIgnoreCase("right"))
                rightCounter++;
            else
                leftCounter++;
        }
        return Math.abs(rightCounter - leftCounter)*90/360;
    }

    public static void main(String[] args) {
        System.out.println(spinAround(new String[]{"left", "left", "left", "left"}));
    }
}
