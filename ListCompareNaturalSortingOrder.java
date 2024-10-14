import java.util.*;

class Person2 implements Comparable<Person2> {
    private String name;

    public Person2(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person2 person2 = (Person2) obj;
        return name.equals(person2.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

  /*  @Override
    public int compareTo(Person2 person) {
        return name.compareTo(person.name);
    }*/
    public int compareTo(Person2 person)
    {
        int len1 = name.length();
        int len2 = person.name.length();
        if(len1>len2)
            return 1;
        else if (len1<len2) {
            return -1;
        }
        else
        return 0;
    }
}

public class ListCompareNaturalSortingOrder {
    public static void main(String[] args) {
        List<Person2> list = new ArrayList<>();
        SortedSet<Person2> set = new TreeSet<>();

        addElements(list);
        addElements(set);

        Collections.sort(list);

        System.out.println("Sorted List:");
        showElements(list);

        System.out.println("Sorted Set:");
        showElements(set);
    }

    private static void addElements(Collection<Person2> col) {
        col.add(new Person2("Sweta"));
        col.add(new Person2("Sumit"));
        col.add(new Person2("Sivan"));
        col.add(new Person2("Suman"));
        col.add(new Person2("Raj"));
    }

    private static void showElements(Collection<Person2> col) {
        for (Person2 element : col) {
            System.out.println(element);
        }
    }
}
