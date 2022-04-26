package Easy;

public class ShuffleClass {

    public static String nameShuffle(String s) {

        String[] firstLast = s.split(" ");
        return  String.join(" ", firstLast[1] , firstLast[0]);

    }

    public static void main(String[] args) {

        System.out.println(nameShuffle("Donald Trump"));

        System.out.println(nameShuffle("Rosie O'Donnell"));

        System.out.println(nameShuffle("Seymour Butts"));
        }
        
    }
