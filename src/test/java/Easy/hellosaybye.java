package Easy;

public class hellosaybye {

    public static String sayHelloBye(String name, int num) {
        if(num==1)
            return "Hello " + Character.toString(name.charAt(0)).toUpperCase() + name.substring(1);
        else
            return "Bye " + Character.toString(name.charAt(0)).toUpperCase() + name.substring(1);
    }

    public static void main(String[] args) {

        System.out.println(sayHelloBye("alon",2));

    }
}
