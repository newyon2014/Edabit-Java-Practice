package Medium3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecamánSequence {
    public static int recamanIndex(int n) {
        int Last = 0;
        int index = 0;
        List<Integer> array = new ArrayList<Integer>();
        array.add(index,Last);
        int Length = array.size();

        while (!array.contains(n)){
            if(Last-Length > 0 && !array.contains(Last-Length))
                array.add(++index,Last-Length);
            else
                array.add(++index,Last+Length);

            Last= array.get(index);
            Length = array.size();
        }
        return array.indexOf(n);
    }

    public static void main(String[] args) {
        System.out.println(recamanIndex(7));
    }
}
