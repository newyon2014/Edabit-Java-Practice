package Easy;

public class GetWordCount {

    public static int countWords(String s) {

        String[] words = s.split(" ");
        for( int i=0; i < words.length;i++){
        }
        return words.length;

    }

    public static void main(String[] args) {

        int firstCount= countWords("Just an example here move along");
       System.out.println(firstCount);

       int secondCount= countWords("This is a test");
       System.out.println(secondCount);

        int thirdCount= countWords("What an easy task, right");
       System.out.println(thirdCount);

    }
}
