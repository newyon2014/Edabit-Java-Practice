package Easy2;

public class validvariablename {
    public static boolean variableValid(String variable) {
        if(variable.contains("") || Character.isDigit(variable.charAt(0)))
            return false;

        return true;
    }
}
