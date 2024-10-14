import java.nio.file.NoSuchFileException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueProg {
    public static void main(String[] args) {
        Queue<Integer> q1 = new ArrayBlockingQueue<>(5);

        q1.add(20);
        q1.add(10);
        q1.add(40);
        q1.add(78);
        q1.add(67);
        System.out.println("head of queue element "+q1.element());
        try
        {
            q1.add(30);
        }
        catch (IllegalStateException e)
        {
            System.out.println("Tried to add too many items to the queue");
        }
        for (Integer value: q1)
        {
            System.out.println("Queue value: "+value);
        }
        System.out.println("removed from queue:" +q1.remove());
        System.out.println("removed from queue:" +q1.remove());
        System.out.println("removed from queue:" +q1.remove());

//        try
//        {
//            System.out.println("removed from queue: "+q1.remove());
//        }
//        catch (NoSuchFileException e)
//        {
//            System.out.println("Tried to remove too many items from queue");
//        }

        Queue<Integer> q2 = new ArrayBlockingQueue<>(2);

        q2.offer(10);
        q2.offer(20);

        System.out.println("Queue 2 peek: "+q2.peek());

        if(q2.offer(30) == false)
        {
            System.out.println("Offer failed to add third item ");
        }
        for (Integer value: q2)
        {
            System.out.println("Queue 2 value: "+value);
        }
        System.out.println("Queue 2 poll: "+q2.poll());
        System.out.println("Queue 2 poll: "+q2.poll());
        System.out.println("Queue 2 poll: "+q2.poll());

    }
}


