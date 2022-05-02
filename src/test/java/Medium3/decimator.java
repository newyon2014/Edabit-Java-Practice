package Medium3;

public class decimator {
    public static String decimator(String s) {
        //int trim = (int)Math.ceil(s.length()/10.0);
        return s.substring(0,s.length()- (int)Math.ceil(s.length()/10.0));

    }

    public static void main(String[] args) {
        System.out.println(decimator("123456789012345678901"));
    }
}
