class demo
{
    public static int binarySearchElement(int arr[], int k)
    {
     int start =0;
     int end= arr.length-1;
     while(start<=end)
     {
         int mid=start+(end-start)/2;
         if(arr[mid]==k)
         {
             return mid;
         }
         if(arr[mid]<k)
         {
             start=mid+1;
         }
         else
         {
             end=mid-1;
         }
     }
     return -1;

    }
}
public class BinarySearch
{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        //output = 3
        int k = 4;
       System.out.println(demo.binarySearchElement(arr,k));
    }
}
