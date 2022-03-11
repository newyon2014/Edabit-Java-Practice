package Medium;

import java.text.DecimalFormat;

public class fuelconsumption {
    static DecimalFormat df = new DecimalFormat("0.00");
    public static double totalDistance(double fuel, double fuelUsage, int passengers, boolean airConditioner) {
        double basicFuelUsage = (fuelUsage/100)*(1+passengers*.05);
        double effectiveFuelConsumption = 0.0;
        if(airConditioner)
           effectiveFuelConsumption= basicFuelUsage * 1.10;
        else
            effectiveFuelConsumption=basicFuelUsage;

        double totalDistace = fuel/effectiveFuelConsumption;
        return Double.parseDouble(df.format(totalDistace));
    }

    public static void main(String[] args) {

        System.out.println(totalDistance(70.0, 7.0, 0, false));
    }
}
