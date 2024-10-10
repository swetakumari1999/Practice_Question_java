public class FindMinimumArray {
    public static int PrintMin(int arr[],int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr[0];
    }
        public static void main (String[]args){
            int arr[] = {1, 2, 3, 2, 4, 6, 4, 3, 9, 1};
            int n = arr.length;
           int minValue =  PrintMin(arr, n);
            System.out.println("Minimum Value is "+minValue);
        }

}
