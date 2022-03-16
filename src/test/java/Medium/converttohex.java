package Medium;

public class converttohex {
    public static String toHex(String str) {
        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : ch) {
            int i = (int) c;
            sb.append(Integer.toHexString(i).toLowerCase()).append(" ");
    }
      return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(toHex("hello world"));
    }
}
