package Medium2;

public class checkmatimaticalexpression {
    public static boolean mathExpr(String expr) {
       return expr.replaceAll("[+\\/%\\-*0-9\\s]","").length()==0;
    }

    public static void main(String[] args) {
        System.out.println(mathExpr("4 + 5"));

    }
}
