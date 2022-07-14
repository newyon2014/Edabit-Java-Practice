package Medium3;

public class palindromicdates {
    public static boolean palindromicDate(String date) {
        String[] array = date.split("/");
        String dateFormat = date.replaceAll("/","");
        String monthFormat =  "" + array[1]+array[0]+array[2];
        System.out.println(monthFormat);
        System.out.println(new StringBuilder(dateFormat).reverse());
        System.out.println("Date Format  " + dateFormat);

      return new StringBuilder(dateFormat).reverse().toString().equals(dateFormat) &&
              new StringBuilder(monthFormat).reverse().toString().equals(monthFormat);

    }

    public static void main(String[] args) {
        System.out.println(palindromicDate("03/03/1822"));
    }
}
