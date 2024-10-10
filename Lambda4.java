import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/*class MyComparator implements Comparator<Integer>
{
    public int compare(Integer I1, Integer I2)
    {
        if(I1<I2)
        {
            return -1;
        }
        else if(I1>I2)
        {
            return +1;
        }
        else
        {
            return 0;
        }
    }
}*/
public class Lambda4
{
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(20);
        al.add(30);
        al.add(10);
        al.add(40);
        al.add(70);
        al.add(0);
        al.add(12);
        System.out.println(al);
      //  Collections.sort(al, new MyComparator());
        Comparator<Integer> c = (I1,I2)-> (I1<I2)?-1:(I1>I2)?1:0;
        Collections.sort(al,c);
        System.out.println(al);
    }

}
