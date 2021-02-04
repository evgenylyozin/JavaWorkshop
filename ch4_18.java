import java.util.*;

public class ch4_18 {
    public static void main(String[] args) {
        
        Map map = new HashMap<>();

        map.put("name", "Kristian");
        map.put("family name", "Larssen");
        map.put("address", "Some Rd");
        map.put("mobile", "555-12345");
        map.put("pet", "cat");

        Iterator <Map.Entry> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            System.out.print("Key = " + entry.getKey());
            System.out.println(", Value = " + entry.getValue());
        }
    }
}