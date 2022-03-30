package Easy;

public class findvowelsrecursively {
    public static int countVowels(String str) {
        if(str==null||str.length() <= 3)
            return 0;

        return((("aeiou".indexOf((Character.toString(str.charAt(str.length()-1))).toLowerCase()) >= 0 ? 1 : 0))
                + countVowels((str = str.substring(0,str.length()-1))));
    }



    public static void main(String[] args) {
        System.out.println(countVowels("apple"));

    }
}
