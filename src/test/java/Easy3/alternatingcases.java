package Easy3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class alternatingcases {
    public static String alternatingCaps(String s) {
        StringBuilder sb = new StringBuilder();
        char[] letters = s.toCharArray();
        for (int i = 0; i <letters.length ; i++) {
            if(i%2==0 && Character.isLetter(letters[i]))
                sb.append(Character.toUpperCase(letters[i]));
            if(i%2!=0 && Character.isLetter(letters[i]))
                sb.append(Character.toLowerCase(letters[i]));


       //   if(Character.isLetter(letters[i]))// && !Character.toString(letters[j]).equals("")){
               // sb.append(Character.toUpperCase(letters[i]));
                //sb.append(Character.toLowerCase(letters[j]));
            }
        return sb.toString();
        }



    public static void main(String[] args) {

        System.out.println(alternatingCaps("OMG this website is awesome!"));
    /*    String name = "How are you?";
        String [] arr = name.split(" ");
        StringBuilder sb = new StringBuilder();

      String str = Arrays.asList(arr)
                .stream()
                .map(s -> {
                    for (int i = 0; i < s.length(); i++) {
                        if(Character.isUpperCase(s.charAt(i)))
                            sb.append(" ").append(Character.toLowerCase(s.charAt(i)));
                        else
                            sb.append(" ").append(Character.toUpperCase(s.charAt(i)));
                    }
                    return sb.toString();
                })
                .collect(Collectors.joining(" "));

        System.out.println(str);*/
       }
    }

