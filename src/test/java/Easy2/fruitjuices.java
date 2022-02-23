package Easy2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class fruitjuices {
    public static String getDrinkID(String flavor, String ml) {
        String flavourString = "";
        if(!flavor.contains("")){
            flavourString=flavor.substring(0,3).toUpperCase().trim();
        }else {
            String [] arr = flavor.split(" ");
            for (int i = 0; i < arr.length; i++) {
                flavourString+=arr[i].substring(0,3).toUpperCase().trim();
            }
        }
        String capacity = ml.replaceAll("ml","");
        return flavourString+capacity;
    }

    public static void main(String[] args) {
        System.out.println(getDrinkID("raspberry and lime", "350ml"));

        String flavour = "raspberry and lime";

        Arrays.stream(flavour.split(" "))
                .map(str -> str.substring(0,3).toUpperCase().trim())
                .collect(Collectors.joining());

        int [] arr = {1, 2, 4, 8, 16, 32};


    }

}
