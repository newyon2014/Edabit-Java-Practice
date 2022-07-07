package Medium2;

public class pitondecimalplaces {
    public static double myPi(int num) {
        double scale = Math.pow(10, num);
        return Math.round(Math.PI * scale) / scale;
    }

    public static void main(String[] args) {
        System.out.println(myPi(4));
    }
}
