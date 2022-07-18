package Medium3;

import org.codehaus.plexus.util.StringUtils;

import java.util.stream.IntStream;

public class whatsthemissingletter {
    public static String missingLetter(String str) {
        String alphabetIndex = "abcdefghijklmnopqrstuvwxyz";
        String missingChar = "";

        int firstIndex = alphabetIndex.indexOf(str.charAt(0));
        int secondIndex = alphabetIndex.indexOf(str.charAt(str.length()-1));
        String sub = alphabetIndex.substring(firstIndex,secondIndex+1);

        for (int i = 0; i < sub.length() && i < str.length(); i++) {
            if(!str.contains(Character.toString(sub.charAt(i))))
                missingChar+=sub.charAt(i);
        }
        return sub.equalsIgnoreCase(str)?"No Missing Letter": missingChar;
    }

    public static void main(String[] args) {
        System.out.println(Math.ceil(0.3));
        System.out.println(missingLetter("tuvxyz"));
        String name = "tuvxyz";
        System.out.println(name.charAt(3) - name.charAt(2));
        String newname = IntStream.rangeClosed(0, name.length() - 1)
                .filter(i -> name.charAt(i+1)-name.charAt(i)!= 1)
                .mapToObj(i -> Character.toString((char) (name.charAt(i) + 1)))
                .findFirst()
                .orElse("No Missing Letter");
        System.out.println(newname);
    }
}
