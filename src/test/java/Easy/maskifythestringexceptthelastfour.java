package Easy;

public class maskifythestringexceptthelastfour {
    public static String maskify(String s) {
        if( s.length()<=3)
            return s;
        if(s.equals(""))
            return "";

        return s.substring(0,s.length()-4).replaceAll("[A-Za-z0-9#;>/(<+)?:~$=]","#") + s.substring(s.length()-4);
    }

    public static void main(String[] args) {

        System.out.println(maskify("################;C~H"));


        // This is for another exercise
        String name = "hApPy";

        System.out.println(name.replaceAll("[^A-Z]","").trim().concat(name.replaceAll("[^a-z]","").trim()));


    }
}
