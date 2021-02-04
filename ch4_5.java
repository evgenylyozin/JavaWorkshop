import java.util.*;

public class ch4_5 {
    public static void main(String[] args) {
        Integer[] myArray = new Integer[] {3,25,2,79,2};

        Set<Integer> mySet = new HashSet<>(Arrays.asList(myArray));

        System.out.println(mySet);
    }
}

