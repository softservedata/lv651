package HW09.HomeWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HW2 {
    /*
    Create map personMap and add to it ten persons of type <String, String> (lastName, firstName).
    Output the entities of the map on the screen.
    There are at less two persons with the same firstName among these 10 people?
    Remove from the map person whose firstName is ”Orest” (or other). Print result.
    */
    public static void main(String[] args) {
        Map<String, String> personMap = initMap();
        System.out.println(personMap);
        //removeByValue(personMap, "Orest");
        removeByValue_v2(personMap, "Orest");
        System.out.println(personMap);
    }

    private static void removeByValue(Map<String, String> personMap, String value) {
        Iterator<Map.Entry<String,String>> iter = personMap.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String,String> entry = iter.next();
            if(value.equalsIgnoreCase(entry.getValue())){
                iter.remove();
            }
        }
    }

    private static void removeByValue_v2(Map<String, String> personMap, String value) {
        personMap.entrySet().removeIf(entry -> value.equalsIgnoreCase(entry.getValue()));
    }

    private static Map<String, String> initMap() {
        Map<String, String> map = new HashMap();
        map.put("Seagal", "Steven");
        map.put("Schwarzenegger", "Arnold");
        map.put("Stallone", "Sylvester");
        map.put("Lundgren", "Dolph");
        map.put("Van Damme", "Jean Claude");
        map.put("Willis", "Bruce");
        map.put("Statham", "Jason");
        map.put("Lyutyi", "Orest");
        map.put("Syniy", "Orest");
        map.put("Bond", "James");
        return map;
    }

}
