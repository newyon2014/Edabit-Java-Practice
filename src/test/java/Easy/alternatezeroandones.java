package Easy;

public class alternatezeroandones {

    public static boolean canAlternate(String str) {
        int zeroCount = 0;
        int oneCount = 0;

        if(!str.contains("0") || !str.contains("1"))
            return false;

        for (int i = 0; i < str.length(); i++) {
            if(Character.toString(str.charAt(i)).equalsIgnoreCase("0"))
                zeroCount++;
            else
                oneCount++;
        }

        if (!(Math.abs(zeroCount-oneCount)==1 || Math.abs(zeroCount-oneCount)==0))
            return false;

        return true;
    }

    public static void main(String[] args) {

        System.out.println(canAlternate("1111"));
    }
}
