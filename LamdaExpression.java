import java.util.function.Function;
// call through lambda expression
interface Interf
{
    public void m1();

}
class Demo implements Interf{
    public void m1()
    {
       System.out.println("Hello....");
    }
    public void add(int a, int b)
    {
     System.out.println("The Sum:"+(a+b));
    }


}
public class LamdaExpression
{
    public static void main(String[] args) {
        /*Function<Integer,Integer> f = i->i*i;
        System.out.println("The Square of:" +f.apply(4));
        System.out.println("The Square of:" +f.apply(6));
        System.out.println("The Square of:" +f.apply(7));


        //() -> System.out.println("Hello");
        */
      //  Demo d = new Demo();
        //d.m1();

       Interf i = ()->System.out.println("Hello... by lambda Expression");
         //Interf i = new Demo();
        i.m1();
        i.m1();
        i.m1();
        i.m1();// by default invoked without using method call;

    }
}
