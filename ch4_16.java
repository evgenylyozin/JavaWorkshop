import java.util.*;

public class ch4_16 {
    public static void main(String[] args) {
        
        List<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(2);
        array.add(37);

        Iterator iterator = array.iterator();

        while(iterator.hasNext()) {
            //point to next element
            int i = (Integer) iterator.next();

            //print elements
            System.out.print(i + " ");
        }

    }
}