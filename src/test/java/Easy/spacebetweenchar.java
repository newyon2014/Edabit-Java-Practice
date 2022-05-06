package Easy;

public class spacebetweenchar {

    public static String spaceMeOut(String str) {

      return str.replaceAll(""," ").trim();

    }

    public static void main(String[] args) {
        System.out.println(spaceMeOut("space here"));

    }

}
