import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person1
{
    private int id;
    private String name;

    public Person1(int id, String jeo) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
class StringLengthComparator implements Comparator<String>
{
    @Override
    public int compare(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();

        if (len1 > len2)
            return 1;
        else if (len1 < len2) {
            return -1;
        }
        return 0;
    }
}

class AlphabeticalComparator implements Comparator<String>
{

    @Override
    public int compare(String s1, String s2) {
       // return s1.compareTo(s2);
        return -s1.compareTo(s2);     // reverse order
    }
}
public class SortingListProg
{
    public static void main(String[] args) {

        /////// SOrting Strings ///////////
        List<String> animals = new ArrayList<>();

        animals.add("cat");
        animals.add("tiger");
        animals.add("lion");
        animals.add("snake");
        animals.add("elephant");
        animals.add("horse");

       // Collections.sort(animals, new StringLengthComparator());
        Collections.sort(animals, new AlphabeticalComparator());

        for (String animal: animals)
        {
            System.out.println(animal);
        }
////////////////// Sorting number ////////////////
        List<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(34);
        numbers.add(45);
        numbers.add(1);
        numbers.add(87);

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer n1, Integer n2) {
                return -n1.compareTo(n2);
            }
        });

        for (Integer number: numbers)
        {
            System.out.println(number);
        }

        List<Person1> people = new ArrayList<Person1>();

        people.add(new Person1(1,"Jeo"));
        people.add(new Person1(2, "Bob"));
        people.add(new Person1(3, "Clare"));
        people.add(new Person1(2, "sue"));

        Collections.sort(people, new Comparator<Person1>() {
            @Override
            public int compare(Person1 p1, Person1 p2) {
               if(p1.getId() > p2.getId())
               {
                   return 1;
               }
               else if(p1.getId() < p2.getId())
                   return -1;
                 return 0;
            }
        });
        for (Person1 person: people)
        {
            System.out.println(person);
        }

    }
}
