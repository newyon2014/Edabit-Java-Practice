package Easy;

public class fractiongreaterthanone {
    public static boolean greaterThanOne(String frac) {

        return (Integer.parseInt(frac.split("/")[0]) > (Integer.parseInt(frac.split("/")[1])));

    }

    public static void main(String[] args) {

        System.out.println(greaterThanOne("4/10"));

    }
}
