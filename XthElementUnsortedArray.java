public class XthElementUnsortedArray
{

    public static int XthElement(int arr[], int x)
    {
       for (int i=0;i<arr.length-1;i++) {
           for (int j = 0; j < arr.length - 1 - i; j++) {
               if (arr[j] > arr[j + 1]) {
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }
       return arr[x-1];
    }
    public static void main(String[] args) {
       int arr[] = {7, 10, 4, 3, 20, 15};
        int x = 3;
        System.out.println(XthElement(arr,x));
    }
}
