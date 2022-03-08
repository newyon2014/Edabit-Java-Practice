package Medium2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class capitalizelastletter {

    public static void main(String[] args) {

        String s= "HELp THe LASt LETTERs CAPITALISe";
         String str =  Arrays.stream(s.split(" "))
                .map(word -> (word.substring(0,word.length()-1)+ word.substring(word.length()-1).toUpperCase()))
              //  .forEach(word -> System.out.println(word));
               .collect(Collectors.joining(" "));
       System.out.println(str);
    }
}
