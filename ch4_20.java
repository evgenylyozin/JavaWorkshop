import java.util.*;

public class ch4_20 {
    public static void main(String[] args) {
        
       Properties properties = new Properties();
       Set setOfKeys;
       String key;

       properties.put("OS","Ubuntu Linux");
       properties.put("version","20.04");
       properties.put("language","Russian (RU)");

       //iterate through the map

       setOfKeys = properties.keySet();

       Iterator iterator = setOfKeys.iterator();

       while(iterator.hasNext()) {
           key = (String)iterator.next();
           System.out.println(key + " = " + properties.getProperty(key));
       }
       System.out.println();

       //Looking for property that is not in list

       String value = properties.getProperty("Keyboard Model","not found");

       System.out.println("Keyboard Model = " + value);

       properties.list(System.out);
    }
}