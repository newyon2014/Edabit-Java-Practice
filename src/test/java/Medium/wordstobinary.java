package Medium;

public class wordstobinary {

    public static String convertBinary(String str) {
        String binaryString = "";
        String firstList = "abcdefghigklm";

        for (int i = 0; i < str.length(); i++) {
            if(firstList.contains(Character.toString(str.charAt(i)).toLowerCase()))
                binaryString+=0;
            else
                binaryString+=1;
        }
       return binaryString;
    }

    public static void main(String[] args) {
        System.out.println(convertBinary("excLAIM"));

    }
}
