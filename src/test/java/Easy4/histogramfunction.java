package Easy4;

public class histogramfunction {
    public static String histogram(int[] arr, String chr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            while(arr[i] > 0){
                sb.append(chr);
                arr[i]--;
            }
            sb.append("\n");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(histogram(new int[] {2, 4, 5, 6}, "o"));
       String name = "yonas";
        System.out.println(name.charAt(name.length()-1));

    }
}
