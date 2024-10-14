import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice
{
    public static void main(String[] args) {
       // Set<String> set1 = new HashSet<>();
       // Set<String> set1 = new LinkedHashSet<>();
        Set<String> set1 = new TreeSet<>();  // default natural sorting order

        if(set1.isEmpty())
        {
            System.out.println("Set2 is empty at start");
        }

        set1.add("dog");
        set1.add("cat");
        set1.add("mouse");
        set1.add("snake");
        set1.add("bear");
        set1.add("beffelow");
     // Adding duplicate item
        set1.add("mouse");
        System.out.println(set1);


        //////////// Iteration////////////

        for (String element: set1)
        {
            System.out.println(element);
        }

        ///////// Does set contain a given item //
        if (set1.contains("mouse"))
        {
            System.out.println("Contain mouse");
        }


        if (set1.contains("cat"))
        {
            System.out.println("Contain cat");
        }

   /// set2 contains some common elements with set1 , and some new
        Set<String> set2 = new TreeSet<>();  // default natural sorting order

        if(set2.isEmpty())
        {
            System.out.println("Set is empty at start");
        }

        set2.add("dog");
        set2.add("cat");
        set2.add("mouse");
        set2.add("snake");
        set2.add("bear");
        set2.add("Monkey");
        set2.add("rat");

        /////////////// Intersection ////////////////////

        Set<String> intersection = new HashSet<>(set1);
        System.out.println(intersection);

        intersection.retainAll(set2);
        System.out.println(intersection);

        //diffrence //

        Set<String> differenece = new HashSet<>(set1);

        differenece.removeAll(set2);
        System.out.println(differenece);




    }
}
