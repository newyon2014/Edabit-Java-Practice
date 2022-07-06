package Medium;

import java.util.Arrays;

public class thisarightangledtriangle {

    public static boolean rightTriangle(int x, int y, int z) {
        if( x <= 0 || y <= 0 || z <= 0)
            return false;
        int [] triangleElements = new int [3];
           triangleElements[0]=x;
           triangleElements[1]=y;
           triangleElements[2]=z;

        Arrays.sort(triangleElements);

        if(Math.pow(triangleElements[2],2)==Math.pow(triangleElements[0],2)+Math.pow(triangleElements[1],2))
            return true;

        return false;
    }

    public static void main(String[] args) {

        System.out.println(rightTriangle(70, 130, 110));

    }
}
