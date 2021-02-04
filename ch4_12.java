import java.util.*;

public class ch4_12 {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();

        list.add(35);
        list.add(19);
        list.add(11);
        list.add(83);
        list.add(7);

        System.out.println(list);

        int index = list.indexOf(19);
        System.out.println("Элемент 19 находится в списке на " + index + " позиции");

        System.out.println("На 1 месте в списке находится элемент " + list.get(index));

    }
}