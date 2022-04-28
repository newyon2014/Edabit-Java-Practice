package Easy;

public class orthogonalvector {

    public static boolean isOrthogonal(int[] arr1, int[] arr2) {
        int orthogonalSum = 0;
        for (int i = 0; i < arr1.length; i++) {
            orthogonalSum+=arr1[i]*arr2[i];
        }
        return (orthogonalSum==0);
    }

    public static void main(String[] args) {

    }
}
