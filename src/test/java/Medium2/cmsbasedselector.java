package Medium2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class cmsbasedselector {
    public static String[] cmsSelector(String[] cms, String re) {
        if(re=="")
            return Arrays.stream(cms)
                         .sorted(Comparator.naturalOrder())
                         .toArray(s-> new String[cms.length]);

            return Arrays.stream(cms)
                    // .map (s -> s.toLowerCase())
                     .filter(s -> s.toLowerCase().contains(re))
                    // .map(s -> Character.toUpperCase(s.charAt(0))+s.substring(1))
                     .toArray(String[]::new);
    }

    public static void main(String[] args) {

        String [] cms = {"WordPress", "Joomla", "Drupal", "Magento"};


            String [] cmsSorted = cmsSelector(cms,"w");

        for (String s:
                cmsSorted) {
            System.out.println(s);
        }

    }
}
