package Medium;

import java.util.HashSet;

public class samenumberofuniqueelements {
    public static boolean same(int[] a1, int[] a2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();

        for (int i = 0; i < a1.length; i++) {
            set1.add(a1[i]);
        }
        for (int i = 0; i < a2.length; i++) {
            set2.add(a2[i]);
        }
        return (set1.size()==set2.size());

    }

    public static void main(String[] args) {

    }
}
