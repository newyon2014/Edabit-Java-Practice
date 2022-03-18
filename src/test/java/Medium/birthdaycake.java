package Medium;

public class birthdaycake {
    public static String[] getBirthdayCake(String name,int age) {
         String [] birthDayWish = new String[3];
        if(age%2==0){
            birthDayWish[0]= " ";
            birthDayWish[1] = "# " + age + " Happy Birthday " + name + "!" + " " + age + " #";
            for (int i = 0; i < birthDayWish[1].length(); i++) {
                birthDayWish[0]+="#";
            }
            birthDayWish[2] = birthDayWish[0];
        } else {
            birthDayWish[0]= " ";
            birthDayWish[1] = "* " + age + " Happy Birthday " + name + "!" + " " + age + " *";
            for (int i = 0; i < birthDayWish[1].length(); i++) {
                birthDayWish[0]+="*";
            }
            birthDayWish[2] = birthDayWish[0];
        }

        return birthDayWish;
    }

    public static void main(String[] args) {

    }
}
