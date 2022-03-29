package Easy.PeopleSalary;

public class getbudget {
    public static double getBudgets(people[] people) {

        double sumSalary= 0;

        for (int i = 0; i < people.length; i++) {
            sumSalary+=people[i].getBudget();
        }
        return sumSalary;
    }

    public static void main(String[] args) {
       // System.out.println(getBudgets());
    }
}
