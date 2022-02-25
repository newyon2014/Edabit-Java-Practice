package Easy2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class clearthefog {
    public static String clearFog(String str) {
        if(str.replaceAll("[fogFOG]","").trim().length()==str.length())
            return  "It's a clear day!";
         return str.replaceAll("[fogFOG]","").trim();
    }

    public static void main(String[] args) {


    }
}
