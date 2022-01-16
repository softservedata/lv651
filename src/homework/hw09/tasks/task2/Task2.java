package homework.hw09.tasks.task2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {

        Map<String, String> personMap = new HashMap<>();
        personMap.put("Romanenko", "Bohdan");
        personMap.put("Kopilov", "Orest");
        personMap.put("Temchenko", "Anton");
        personMap.put("Nazarova", "Viktoria");
        personMap.put("Paliy", "Anton");
        personMap.put("Ilyin", "Bohdan");
        personMap.put("Heletey", "Sofia");
        personMap.put("Sagaydachna", "Anna");
        personMap.put("Domenkiv", "Ihor");
        personMap.put("Petrenko", "Kristina");
        System.out.println("personMap = " + personMap);

        System.out.println("\nPeople with same name: ");
        for (Map.Entry<String, String> entry1: personMap.entrySet()) {
            for (Map.Entry<String, String> entry2: personMap.entrySet()) {
                if (entry2.getValue().equals(entry1.getValue()) && !entry1.getKey().equals(entry2.getKey())) {
                    System.out.println(entry1);
                }
            }
        }

        System.out.println("\nRemove \"Orest\" from the map");

        Iterator<Map.Entry<String, String>> iterator = personMap.entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getValue().equals("Orest")) {
                iterator.remove();
            }
        }

        System.out.println("personMap = " + personMap);
    }
}
