/*class MyRunnable implements Runnable
{
    public void run()
    {
        for (int i=0;i<10;i++)
        {
            System.out.println("Child Thread");
        }
    }
}*/
//Multithreading program
public class Lambda3
{
    public static void main(String[] args) {
     //MyRunnable r = new MyRunnable();
        Runnable r =()->
        {
            for (int i=0;i<10;i++)
            {
                System.out.println("Child Thread");
            }
        };
     Thread t = new Thread(r);
     t.start();
     for(int i=0;i<10;i++)
     {
         System.out.println("Main Thread");
     }
    }
}

// map and filter, collect, for each
//push all code git
//learn basic cmd
//stream api
