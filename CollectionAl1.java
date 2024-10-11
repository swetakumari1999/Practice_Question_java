import javax.swing.*;
import java.util.ArrayList;

public class CollectionAl1
{
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);
        al.add(70);
        al.add(80);
        al.add(90);
        System.out.println(al);

        //Retrieving
        System.out.println(al.get(1));

        //Removing items
        al.remove(al.size()-1);

        //This is very slow
        al.remove(0);

        System.out.println("\n Iteration #!: ");
        // Indexed for loop iteration
        for (int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }
        for (Integer i :al)
        {
            System.out.print(i+" ");
        }

    }
}
