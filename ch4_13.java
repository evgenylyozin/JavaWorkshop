import java.util.*;

public class ch4_13 {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();

        list.add(35);
        list.add(19);
        list.add(11);
        list.add(83);
        list.add(7);

        System.out.println(list);

        int index = list.lastIndexOf(83);
        System.out.println("83 находится на позиции: " + index);


        list.remove(index-1);
        System.out.println(list);
        index = list.lastIndexOf(83);

        System.out.println("Теперь 83 находится на позиции: " + index);

    }
}