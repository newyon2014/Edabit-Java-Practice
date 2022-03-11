package Easy2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class indexofcapitalletters {
    public static int[] indexOfCaps(String s) {
        List<Integer> list = new ArrayList<>();
        int [] index = new int[list.size()];
        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i)))
                list.add(s.indexOf(s.charAt(i)));
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        System.out.println(indexOfCaps("eDaBiT"));

        String name = "EDaBiT";

        IntStream.rangeClosed(0,name.length())
                .filter(i -> Character.isUpperCase(name.charAt(i)))
                .toArray();

    }
}
