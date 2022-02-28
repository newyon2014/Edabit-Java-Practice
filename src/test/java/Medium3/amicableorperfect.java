package Medium3;

public class amicableorperfect {
    public static String numType(int num) {
        int xDivisor = 0;
        int yDivisor = 0;
        for (int i = 1; i < num; i++) {
            if(num%i==0)
                xDivisor+=i;
        }
        for (int i = 1; i < xDivisor; i++) {
            if(xDivisor%i==0)
                yDivisor+=i;
        }
        return num==xDivisor && num==yDivisor? "Perfect":yDivisor==num?"Amicable":"Neither";
    }

    public static void main(String[] args) {
        System.out.println(numType(6));
    }
}
