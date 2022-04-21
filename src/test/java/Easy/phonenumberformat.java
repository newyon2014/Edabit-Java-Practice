package Easy;

public class phonenumberformat {

    public static String formatPhoneNumber(int[] nums) {

        String formattedPhoneNumber = "(";

        for (int i = 0; i < nums.length; i++) {
            formattedPhoneNumber+=nums[i];
            if(formattedPhoneNumber.length()==4)
                formattedPhoneNumber+=") ";
            if(formattedPhoneNumber.length()==9)
                formattedPhoneNumber+="-";
        }
        return formattedPhoneNumber;
    }

    public static void main(String[] args) {

        String formattedPhone = formatPhoneNumber(new int[]{5, 1, 9, 5, 5, 5, 4, 4, 6, 8});
        System.out.println(formattedPhone);

    }
}
