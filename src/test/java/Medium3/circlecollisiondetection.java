package Medium3;

public class circlecollisiondetection {
    public static boolean isCircleCollision(int[] c1, int[] c2) {

        return Math.abs(c1[1]-c2[1]) <= c1[0] && Math.abs(c1[1]-c2[1]) <= c2[0];

    }
}
