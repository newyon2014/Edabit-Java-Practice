package Easy3;

public class compoundingletters {
    public static String accum(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(str.charAt(0)));

        for (int i = 1; i < str.length(); i++) {
            sb.append("-");
            sb.append(Character.toUpperCase(str.charAt(i)));
            int j = i;
            while (j > 0){
                sb.append(Character.toLowerCase(str.charAt(i)));
                j--;
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(accum("RqaEzty"));
    }
}
