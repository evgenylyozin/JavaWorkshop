import java.util.*;

public class ch4_15 {
    public static void main(String[] args) {
        
        Map map = new HashMap<>();

        map.put("number", new Integer(1));
        map.put("text", new String("hola"));
        map.put("decimal", new Double(5.7));

        System.out.println(map.get("text"));

        if (!map.containsKey("byte")) {
            System.out.println("No bytes here");
        }

        System.out.println(map.entrySet());
        System.out.println(map.keySet());

    }
}