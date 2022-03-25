package Easy;

public class evenandoddindexcombined {

    public static String indexShuffle(String str) {
        String evenIndexed = "";
        String oddIndexed = "";

        for (int i = 0; i < str.length(); i++) {
            if(i%2!=0)
                oddIndexed+=str.charAt(i);
            else
                evenIndexed+=str.charAt(i);
        }
        return evenIndexed + oddIndexed;
    }

    public static void main(String[] args) {

        System.out.println(indexShuffle("it was a beautiful day"));
        System.out.println("i a  euiu atwsabatfldy");

        String name ="Yonas";


    }
}
