package Easy3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class amateurhour {
    public static String hoursPassed(String t1, String t2) throws ParseException {

        if(t1.equalsIgnoreCase(t2))
            return "no time passed";

        int firstTimeIndex = 0;
        int lastTimeIndex = 0;

        String [] time = {"12:00 AM" , "1:00 AM" , "2:00 AM" , "3:00 AM" , "4:00 AM" , "5:00 AM" ,
                          "6:00 AM" , "7:00 AM" , "8:00 AM" , "9:00 AM" , "10:00 AM" , "11:00 AM" ,
                          "12:00 PM" , "1:00 PM" , "2:00 PM" , "3:00 PM" , "4:00 PM" , "5:00 PM",
                          "6:00 PM" , "7:00 PM" , "8:00 PM" , "9:00 PM" , "10:00 PM" , "11:00 PM"};

        for (int i = 0; i < time.length; i++) {
            if(time[i].equalsIgnoreCase(t1))
                firstTimeIndex=i;
            if(time[i].equals(t2))
                lastTimeIndex=i;
        }
        return new StringBuilder().append(lastTimeIndex-firstTimeIndex).append(" ").append("hours").toString();
    }

    public static void main(String[] args) throws ParseException {
        System.out.println(hoursPassed("3:00 AM", "9:00 AM"));
    }
}
