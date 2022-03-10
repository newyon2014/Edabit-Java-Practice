package Medium4;

public class powerranger {
    public static int powerRanger(int power, int min, int max) {
        int counter = 0;
        for (int i = 1; i <=max ; i++) {
            if(Math.pow(i,power)>= min && Math.pow(i,power)<= max)
                counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(powerRanger(4, 250, 1300));
    }
}
