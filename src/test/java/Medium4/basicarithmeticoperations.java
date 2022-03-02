package Medium4;

public class basicarithmeticoperations {
    public static int operation(String a, String b, String op) {
        int mathResult = 0;
        switch(op){
            case "add": mathResult= Integer.parseInt(a) + Integer.parseInt(b); break;
            case "subtract": mathResult= Integer.parseInt(a) - Integer.parseInt(b); break;
            case "multiply": mathResult= Integer.parseInt(a) * Integer.parseInt(b); break;
            case "divide" : {
                if(Integer.parseInt(b)==0)
                    mathResult= Integer.MIN_VALUE;
                else
                    mathResult= Integer.parseInt(a) / Integer.parseInt(b); break;
            }
        }
        return mathResult;

    }

    public static void main(String[] args) {
        System.out.println(operation("9", "0", "divide"));
    }
}
