import java.util.Scanner;

public class ReverseArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array");
        int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter value of array");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
            System.out.println("Original array "+arr[i]);


        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.println("Reverse of array "+arr[i]);
        }

    }
}
