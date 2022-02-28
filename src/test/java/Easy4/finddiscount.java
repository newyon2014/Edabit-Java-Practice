package Easy4;

public class finddiscount {
    public static double discount(int price, int percentage) {

        return (price - price*(percentage*.01))*100/100;

    }

    public static void main(String[] args) {
        System.out.println(discount(211, 50));
    }

}
