package Medium4;

import java.util.Arrays;
import java.util.stream.Collectors;

public class emphasizethewords {
    public static String emphasize(String str) {
        if(str.equals(" "))
            return " ";
        return Arrays.stream(str.split(" "))
                .map(s -> s.substring(0,1).toUpperCase()+s.substring(1,s.length()).toLowerCase())
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        System.out.println(emphasize(" "));
        String name = "hello world!";

        String ename = Arrays.stream(name.split(" "))
              .map(str -> str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase())
              .collect(Collectors.joining(" "));

        System.out.println(ename);
    }
}
