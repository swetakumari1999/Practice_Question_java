import java.util.ArrayList;

public class CollectionAl2
{
    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<>();
        al.add(1);
        al.add(4);
        al.add(5);
        al.add(9);
        al.add(3);
        System.out.println(al);
        al.add(2,6);  // index based add element
        System.out.println(al);

    }
}
