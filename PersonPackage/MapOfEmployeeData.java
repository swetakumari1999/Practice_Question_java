package PersonPackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapOfEmployeeData
{
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person(20,"Test1"));
        map.put(2, new Person(25,"test2"));
        map.put(null, new Person(27,"test2"));
        map.put(null, new Person(27,"test2"));
        System.out.println(map);

        Map<Integer, Person> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, new Person(20,"Test1"));
        linkedHashMap.put(2, new Person(25,"test2"));
        linkedHashMap.put(null, new Person(27,"test2"));
        linkedHashMap.put(null, new Person(27,"test2"));
        System.out.println(linkedHashMap);

        Map<Integer, Person> treeMap = new TreeMap<>();
        treeMap.put(1, new Person(20,"Test1"));
        treeMap.put(2, new Person(25,"test2"));
       // treeMap.put(null, new Person(27,"test2"));
        //treeMap.put(null, new Person(27,"test2"));
        System.out.println(treeMap);
    }

}
