package Medium2;

public class filterrepeatingcharacters {

    public static void main(String[] args) {
        String a = "aaa";

        boolean isequal = a.replace(a,a).length()==a.length();
        System.out.println(isequal);
    }
}
