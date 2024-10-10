import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = {1, 2, 7, 8, 10, 3, 4, 5, 1, 3, 2, 3, 4, 6};

        // Sort the array first
        Arrays.sort(arr);

        int n = arr.length;
        int[] temp = new int[n]; // Temporary array to store unique elements
        int j = 0;

        for (int i = 0; i < n; i++) {
            // If current element is not equal to the last added element in temp
            if (i == 0 || arr[i] != arr[i - 1]) {
                temp[j++] = arr[i]; // Store unique element
            }
        }

        // Print unique elements
        System.out.println("Unique elements:");
        for (int i = 0; i < j; i++) {
            System.out.println(temp[i]);
        }
    }
}
