package Medium2;

public class endlettersofnumber {
    public static String returnTheEndOfNumber(int num) {
     return  num % 100 == 11 || num % 100 == 12 || num % 100 == 13 ? num + "-TH" : num +
         new String[]{"-TH", "-ST", "-ND", "-RD", "-TH", "-TH", "-TH", "-TH", "-TH", "-TH"}[num % 10];
        //
       /*String str = Integer.toString(num);
       String EndOfNumer = Integer.toString(num).substring(str.length()-1);
        switch (EndOfNumer){
            case "1":
                EndOfNumer = num + "-ST";
                break;
            case "2":
                EndOfNumer = num + "-ND";
                break;
            case "3":
                EndOfNumer = num + "-RD";
                break;
            default:
                EndOfNumer = num + "-TH";
                break;
        }
        return EndOfNumer;*/
    }

    public static void main(String[] args) {

        System.out.println(returnTheEndOfNumber(412));

    }

}
