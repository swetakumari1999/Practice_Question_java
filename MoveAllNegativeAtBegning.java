import java.util.Arrays;

public class MoveAllNegativeAtBegning
{
    public static void moveArray(int arr[])
    {
        int j=0 , temp;
     for (int i=0;i<arr.length;i++)
     {
         if(arr[i]<0)
         {
             if(i !=j)
             {
                 temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
             }
             j++;
         }
     }
    }
    static void display(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
    public static void main(String[] args) {
        int arr[] = {1,-9,-6,2,3,4,5,-1,-7,2,-4};
       Arrays.sort(arr);
        moveArray(arr);
        display(arr);
        //System.out.println(moveArray(arr));
    }
}
