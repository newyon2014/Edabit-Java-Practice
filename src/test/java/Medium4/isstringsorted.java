package Medium4;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class isstringsorted {
    public static boolean isInOrder(String str){

        return str.equalsIgnoreCase(Stream.of(str.split(""))
                .sorted()
                .collect(Collectors.joining("")));

    }

    public static void main(String[] args) {
        System.out.println(isInOrder("123"));
    }

}
