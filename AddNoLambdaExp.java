interface Interf1
{
  public void add(int a, int b);
}
/*class Demo extends Interf1
{
    public void add(int a , int b)
    {
        System.out.println(a+b);
    }
}*/
public class AddNoLambdaExp
{
    public static void main(String[] args) {
        Interf1 r = (int a, int b)-> System.out.println("The sum of two no is"+(a+b));
        r.add(10,20);
        Interf1 r1 = ( a, b)-> System.out.println("The sum of two no is"+(a+b)); // without adding the data type
        r1.add(40,20);

    }
}
