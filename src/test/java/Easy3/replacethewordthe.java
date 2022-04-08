package Easy3;

public class replacethewordthe {
    public static String replaceThe(String str) {
        StringBuilder sb = new StringBuilder();
        String vowels ="aeiou";
        String [] arr = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("the") && vowels.contains(Character.toString(arr[i+1].charAt(0)))) {
                sb.append("an").append(" ");
            }else if(arr[i].equals("the") && !arr[i+1].startsWith("aeiou")){
                sb.append("a").append(" ");
            }else{
                sb.append(arr[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(replaceThe("the quick brown fox jumps over the lazy dog"));
    }
}
