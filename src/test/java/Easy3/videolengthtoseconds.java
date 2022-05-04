package Easy3;



public class videolengthtoseconds {
    public static int minutesToSeconds(String tm) {

        String[] arr = tm.split(":");
        if(Integer.parseInt(arr[1])>= 60)
            return -1;

        return Integer.parseInt(arr[0])*60+ Integer.parseInt(arr[1]);
    }

    public static void main(String[] args) {
        System.out.println(minutesToSeconds("01:30"));

    }
}
