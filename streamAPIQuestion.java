import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class streamAPIQuestion {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);
        al.add(33);
        al.add(70);
        System.out.println(al);
// Without stream api use
       /* List<Integer> l = new ArrayList<>();
        for (Integer l1 : al) {
            if (l1 % 2 == 0) {
                l.add(l1);
               // System.out.println(l);

            }
        }*/
        // with streams
        List<Integer> l1 = al.stream().filter(I->I % 2 == 0).collect(Collectors.toList());
        System.out.println(l1);


    }
}
