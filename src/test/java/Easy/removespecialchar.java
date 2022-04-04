package Easy;

public class removespecialchar {
    public static String removeSpecialCharacters(String s) {
        return s.replaceAll("[!@#$+=<>~'|\\]\\[,{}'`%.^&\\*()]" ,"");
    }

    public static void main(String[] args) {

        String string = "Etiam#!!!!!,,, [`po%rta ~sem!] {male*su-ada} (ma*gna) mo^llis... eui$smod???";
        System.out.println(removeSpecialCharacters(string));
    }
}
