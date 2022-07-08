package Medium2;

public class timeconversion {
    public static String digitalClock(int seconds) {
        int second = seconds % 60;
        int minute = seconds / 60;
        if (minute >= 60) {
            int hour = minute / 60;
            minute %= 60;
            return hour + ":" + (minute < 10 ? "0" + minute : minute) + ":" + (second < 10 ? "0" + second : second);
        }
        return minute + ":" + (second < 10 ? "0" + second : second);

    }
    public static void main(String[] args) {
        System.out.println(digitalClock(87000));

    }
}
