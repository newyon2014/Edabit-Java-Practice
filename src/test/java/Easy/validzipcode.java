package Easy;

public class validzipcode {

    public static boolean isValid(String zip) {

        return (zip.replaceAll("\\d{5}","").length()==0)? true : false;

    }

    public static void main(String[] args) {

       System.out.println(isValid("853a7"));

    }
}
