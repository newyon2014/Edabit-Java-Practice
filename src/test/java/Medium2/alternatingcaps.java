package Medium2;

public class alternatingcaps {
    public static String alternatingCaps(String s) {
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for (int i=0; i< s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append(" ");
                continue;
            } else if (counter%2 == 0)
                sb.append(Character.toUpperCase(s.charAt(i)));
              else
                sb.append(Character.toLowerCase(s.charAt(i)));
            counter++;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(alternatingCaps("How are you?"));

/*        String name = "How are you?";
        name = name.replaceAll(" ","-");
        System.out.println(name);
        String finalstr =" ";
        char [] c = name.toCharArray();
        finalstr+=c[0];
        for (int i = 1; i < c.length; i+=2) {
            if(Character.isUpperCase(c[i]) && c[i]!='-')
               finalstr+=Character.toLowerCase(c[i]);
            if(Character.isLowerCase(c[i]) && c[i]!='-')
                finalstr+=Character.toUpperCase(c[i]);
        }
        System.out.println(finalstr);*/
    }
}
