package Medium;

import java.util.HashSet;
import java.util.Set;

public class counttotalofduplicateexceptfirst {
    public static int duplicates(String str) {
        Set<String> set = new HashSet<>();
        int duplicateCounter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (!set.add(Character.toString(str.charAt(i))))
                duplicateCounter++;
        }
        return duplicateCounter;
    }

    }

