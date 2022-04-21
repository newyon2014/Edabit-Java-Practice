package Easy;

public class onebuttonmessagedevice {
    public static int howManyTimes(String msg) {
        String ref = "abcdefghijklmnopqrstuvwxyz";
        int totalMessage= 0;
        for (int i = 0; i < msg.length(); i++) {
            totalMessage+= (ref.indexOf(msg.charAt(i))+1);
           }
        return totalMessage;
    }

    public static void main(String[] args) {
        System.out.println(howManyTimes("abde"));

    }
}
