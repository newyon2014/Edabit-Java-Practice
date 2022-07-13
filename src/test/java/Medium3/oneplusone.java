package Medium3;

public class oneplusone {
    public static String wordedMath(String expr) {
        String numeric = "zot";
        String [] value = {"Zero","One","Two"};
        String [] array = expr.split(" ");
        for (String s:
             array) {
            System.out.print(s);
        }
        if(array[1].equalsIgnoreCase("minus"))
          //  System.out.println("Minus scenario  " + numeric.indexOf(array[0].toLowerCase().charAt(0)));
          //  System.out.println("Minus scenario  " + numeric.indexOf(array[2].toLowerCase().charAt(0)));
            return value[numeric.indexOf(array[0].toLowerCase().charAt(0)) -
                    numeric.indexOf(array[2].toLowerCase().charAt(0))];

         //   System.out.println("Plus scenario  " + numeric.indexOf(array[0].toLowerCase().charAt(0)));
          //  System.out.println("Plus scenario  " + numeric.indexOf(array[2].toLowerCase().charAt(0)));
          //  System.out.println(array[2].toLowerCase().charAt(0));
            return value[numeric.indexOf(array[0].toLowerCase().charAt(0)) +
                    numeric.indexOf(array[2].toLowerCase().charAt(0))];
    }

    public static void main(String[] args) {
        System.out.println(wordedMath("one minus one"));
    }
}
