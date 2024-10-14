import java.util.HashMap;
import java.util.Map;

public class HashMapQuestion
{
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"Four");
        map.put(5,"Five");
        map.put(6,"Six");
        map.put(7,"Seven");

        map.put(6,"Hello");

        String text = map.get(6);

        String text2 = map.get(7);
        System.out.println(text);
        System.out.println(text2);

        for (Map.Entry<Integer, String> entry:map.entrySet())
        {
            int key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key +" "+value);
        }

    }
}
