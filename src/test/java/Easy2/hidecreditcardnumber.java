package Easy2;

public class hidecreditcardnumber {

    public static String cardHide(String card) {
        String maskedNUmber = " ";
        for (int i = 0; i < card.length()-4; i++) {
            maskedNUmber+="*";
        }
        return maskedNUmber.trim() + card.substring(card.length()-4);
    }

    public static void main(String[] args) {

    }
}
