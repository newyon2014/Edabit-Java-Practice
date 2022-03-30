package Easy3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class removeduplicate {
    public static int[] removeDups(int[] nums) {
        return Arrays.stream(nums)
                .distinct()
                .toArray();
    }

    public static String[] removeDups(String[] str) {
          List<String> list = Arrays.stream(str)
                  .distinct()
                  .collect(Collectors.toList());
          String [] strarr = new String [list.size()];
        for (int i = 0; i < strarr.length; i++) {
            strarr[i]=list.get(i);
        }
            return strarr;
    }

    public static void main(String[] args) {
        for (String s:
                removeDups(new String[]{"The", "big", "cat"})) {
            System.out.println(s);
        }

        String [] sample = {"javascript", "python", "ruby", "c"};

        String[] sample2 = Arrays.asList(sample)
                .stream()
                .distinct()
                .toArray(String -> new String[String]);

    }
}
