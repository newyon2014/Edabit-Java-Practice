package Medium2;

public class reversecodingpowerof {

    public static int mysteryFunc(int num) {
       StringBuilder sb = new StringBuilder();
       int diff = 0;
        for (int i = 1; i < num; i++) {
            if(Math.pow(2,i) < num)
                sb.append("2");
            if(Math.pow(2,i) > num) {
              //  diff = (int) Math.pow(2, i ) - num;
                sb.append(num-(int) Math.pow(2, (i-1)));
                break;
            }
        }
        return Integer.valueOf(sb.toString());

    }

    public static void main(String[] args) {
        System.out.println(mysteryFunc(24));
    }
}
