package Easy3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class findthebomb {
    public static String bomb(String str) {

       /* return str.replaceAll("\\b(?!bomb|BOMB)\\b\\S+","").replaceAll("\\s","")
                .trim().equalsIgnoreCase("bomb")?"DUCK!":"Relax, there's no bomb.";*/

        String [] arr = str.split(" ");

         String isThereABomb = Arrays.stream(arr)
                .map(s-> s.replaceAll("[^bombBOMB]","").trim())
                .filter(s -> s.equalsIgnoreCase("bomb"))
                .collect(Collectors.joining());

        return isThereABomb.equalsIgnoreCase("bomb")?"DUCK!":"Relax, there's no bomb.";

    }
    public static void main(String[] args) {
        String str = "Hey, did you think there is a BOMB?";
        String [] arr = str.split(" ");
        for (String s:
            arr ) {
            //System.out.println(s);
        }
    //    System.out.println(bomb("Hey, did you think there is a BOMB?"));
         String Str2 = Arrays.stream(arr)
                 .map(s-> s.replaceAll("[^bombBOMB]","").trim())
                .filter(s -> s.equalsIgnoreCase("bomb"))
                .collect(Collectors.joining());
     System.out.println(Str2);

      //System.out.println(str.replaceAll("\\b(?!bomb|BOMB)\\b\\S+","").replaceAll("\\s",""));
       // return str.replaceAll("\\b(?!bomb|BOMB)\\b\\S+","").trim().equalsIgnoreCase("bomb")?"DUCK":"Relax, there's no bomb.";
    }
}
