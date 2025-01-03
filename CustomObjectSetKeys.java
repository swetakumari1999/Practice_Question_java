import java.util.*;

class Person
{
    private int id;
    private String name;

    public Person(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public String toString()
    {
        return "{ID is: "+ id + "; name is: "+name+ "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
public class CustomObjectSetKeys
{
    public static void main(String[] args) {


        Person p1 = new Person(0,"Bob");
        Person p2 = new Person(1,"Sue");
        Person p3 = new Person(2,"Mike");
        Person p4 = new Person(1,"Sue");
        Map<Person, Integer> map = new LinkedHashMap<>();

        map.put(p1, 1);
        map.put(p2, 2);
        map.put(p3, 3);
        map.put(p4, 1);

        for (Person key: map.keySet())
        {
            System.out.println(key +": "+ map.get(key));
        }

        Set<Person> set = new LinkedHashSet<Person>();

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);

        System.out.println(set);
    }
}
