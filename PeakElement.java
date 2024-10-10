public class PeakElement
{
    public static int peak(int arr[])
    {
        int n = arr.length;
        if(n==1)
            return 0;
        if(arr[0]>=arr[1])
            return 0;
        for (int i=1;i< arr.length-1;i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
                return arr[i];
        }
            return 0;


    }
    public static void main(String[] args) {
        int arr[]= {5, 10, 20, 15};
        System.out.println(peak(arr));
    }
}
