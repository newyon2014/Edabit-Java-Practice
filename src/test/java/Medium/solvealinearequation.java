package Medium;

public class solvealinearequation {
    public static int solveEquation(String equation) {
        String [] equationElements = equation.split(" ");
        //System.out.println(Integer.parseInt(equationElements[2].trim()));

        if(Integer.parseInt(equationElements[2].trim()) < 0 || equationElements[1].trim().equals("-"))
            return Integer.parseInt(equationElements[4].trim()) + Math.abs(Integer.parseInt(equationElements[2].trim()));

        return Integer.parseInt(equationElements[4].trim()) - Integer.parseInt(equationElements[2].trim());
    }

    public static void main(String[] args) {
        System.out.println(solveEquation("x - 9 = 10"));


    }
}
