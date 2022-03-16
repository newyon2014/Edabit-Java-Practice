package Easy3;

public class weeklysalary {

    public static int WeeklySalary(int[] hours) {
        int totalWeeklySalary = 0;
        for (int i = 0; i < hours.length; i++) {
            if( i<=4 && hours[i]<=8)
                totalWeeklySalary += hours[i] * 10;
            if(i<=4 && hours[i]> 8)
                totalWeeklySalary+=(hours[i]-8)*15 + 8 * 10;
           if(i > 4 && hours[i]<=8)
                totalWeeklySalary += hours[i] * 20;
            if(i > 4 && hours[i] > 8)
                totalWeeklySalary+=(hours[i]-8)*30 + 8 * 20;
        }
        return totalWeeklySalary;
    }

    public static void main(String[] args) {
        System.out.println(WeeklySalary(new int[]{10, 10, 10, 0, 8, 0, 0}));

    }
}
