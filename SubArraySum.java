public class SubArraySum
{
    public static int[] subarray(int arr[], int sum) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (sum == arr[i] + arr[j]) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
       int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23}, sum = 23;
        int[] result =  subarray(arr,sum);
        System.out.println(result[0]+" "+result[1]);
    }
}
