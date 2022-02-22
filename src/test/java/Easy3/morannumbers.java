package Easy3;

public class morannumbers {
    public static String moran(int n) {
        String str = Integer.toString(n);
        int Sum = 0;
        for (Character c:
             str.toCharArray()) {
            Sum+=Integer.parseInt(Character.toString(c));
        }
        if(Sum%2==0 && n%Sum==0)
            return "H";
        else if(Sum%2!=0 && n%Sum==0)
            return "M";
        else
            return "Neither";
    }

    public static void main(String[] args) {
        System.out.println(moran(491423));
    }

    }

