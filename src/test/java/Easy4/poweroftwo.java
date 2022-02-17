package Easy4;

public class poweroftwo {
    public static boolean powerOfTwo(int num) {
        if(num < 0)
            return false;
        if(num==1)
            return true;

        for (int x = 2; x <= Math.sqrt(num); x++) {
            int y = 2;
            double p = Math.pow(x, y);
            while (p <= num && p > 0) {
                if (p == num)
                    return true;
                y++;
                p = Math.pow(x, y);
            }
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(powerOfTwo(18));
        System.out.println("======\n==\n===============\n===");

    }
}
