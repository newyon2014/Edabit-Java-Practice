package Medium;

public class rectangleinacircle {
    public static boolean rectangleInCircle(int w, int h, int radius) {
        System.out.println(Math.pow(w,2));
        System.out.println(Math.pow(h,2));
        System.out.println(Math.pow(radius*2,2));
       // System.out.println((Math.pow(w,2)+Math.pow(h,2)));
       // System.out.println(Math.sqrt(Math.pow(w,2)+Math.pow(h,2)));
       // System.out.println(Math.sqrt((Math.pow(w,2))+(Math.pow(h,2)))/2);

        return (Math.pow(w,2) + Math.pow(h,2) <= Math.pow(radius*2,2));

    }

    public static void main(String[] args) {
        System.out.println(rectangleInCircle(21, 12, 12));
    }
}
