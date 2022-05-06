package Easy3;

public class tempretureconversion {
    public static double[] convertToTemps(double celcius) {

        return new double [] {Math.round((celcius*9/5 +32)*100.0)/100.0,Math.round((celcius + 273.15)*100.0)/100.0};
    }

    public static void main(String[] args) {
           double [] d = convertToTemps(-273.16);

        for (double dd:
             d) {
            System.out.println(dd);

        }
    }
}
