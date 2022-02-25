package Easy4;

public class endcorona {
    public static int endCorona(int recovers, int newCases, int activeCases) {
        int noOfDays = 0;
        while (activeCases > 0){
            activeCases+=newCases;
            activeCases-=recovers;
            noOfDays++;
        }
        return noOfDays;
    }

    public static void main(String[] args) {
        System.out.println(endCorona(3000, 2000, 50699));
    }
}
