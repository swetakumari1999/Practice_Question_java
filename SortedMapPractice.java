import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMapPractice
{
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
        TreeMap<Integer, String> tm = new TreeMap<>();
        testMap(tm);
    }

    public static void testMap(Map<Integer, String> map)
    {
        map.put(9, "fox");
        map.put(4,"cat");
        map.put(8,"dog");
        map.put(1,"giraffe");
        map.put(15,"bear");
        map.put(6,"snake");

        for (Integer key: map.keySet())
        {
            String value = map.get(key);
            System.out.println(key +" "+ value);
        }

    }
}
