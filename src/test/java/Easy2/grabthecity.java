package Easy2;

public class grabthecity {
    public static String grabCity(String str) {
        String withOutCity = str.replaceAll("\\[\\S+\\s?\\S+\\s?\\S+\\]$","");
        return str.substring(withOutCity.length()).replaceAll("\\[","").replaceAll("\\]","");
    }

    public static void main(String[] args) {
        System.out.println(grabCity("[Duration: 7 hours] Tour of the Maritimes [Prince Edward Island]"));
    }
}
