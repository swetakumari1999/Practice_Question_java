import java.util.Iterator;
import java.util.LinkedList;

public class UsingIteratorProg
{
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();

        animals.add("fox");
        animals.add("cat");
        animals.add("dog");
        animals.add("rabbit");

        Iterator<String> itr = animals.iterator();

        while (itr.hasNext())
        {
            String value = itr.next();
            System.out.println(value);

            if (value.equals("cat"))
            {
                itr.remove();
            }
        }
        System.out.println();

        //Modern Iterator , java 5 and later
        for (String animal:animals)
        {
            System.out.println(animal);
        }

    }
}
