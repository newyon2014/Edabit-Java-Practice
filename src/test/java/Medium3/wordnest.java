package Medium3;

public class wordnest {
    public static int wordNest(String word, String nest) {
        int stage =0;
        while(!nest.equals(word)){
            nest = nest.replace(word,"");
            stage++;
        }
        return stage;
    }

    public static void main(String[] args) {
        System.out.println(wordNest("incredible", "increinincrincredibleediblecredibledible"));

        String nest =  "increinincrincredibleediblecredibledible";
        //nest = nest.replace("incredible","");
    //  System.out.println(nest);
        int stage =0;
        while(!nest.equals("incredible")){
                nest = nest.replace("incredible","");
                stage++;
        }
        System.out.println(stage);
    }
}
