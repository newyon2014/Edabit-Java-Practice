package Easy;

public class decimalplaces {
    public static int getDecimalPlaces(String num) {
        if(!num.contains("."))
            return 0;

        return num.split("\\.")[1].length();
    }

    public static void main(String[] args) {
        System.out.println(getDecimalPlaces("3.1415"));
      //  System.out.println("11,000".split("\\.").length());

    }
}
