public class FindMaximumArray {

    public static void shortArray(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }


    }
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 3, 2, 4, 1, 5};
        int n = arr.length;
        shortArray(arr);
        System.out.println(arr[n-1]);

    }
}
