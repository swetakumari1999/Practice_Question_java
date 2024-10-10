public class FindMissingNo {
    public static int missingno(int arr[], int n) {
        int sum1 = 0; // Sum of numbers from 1 to n
        int sum2 = 0; // Sum of numbers in the array

        // Calculate the sum of numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            sum1 += i;
        }

        // Calculate the sum of the numbers in the array
        for (int i = 0; i < arr.length; i++) {
            sum2 += arr[i];
        }

        // The missing number is the difference
        return sum1 - sum2;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6, 3, 7, 8}; // Missing number is 5
        int n = 8; // The highest number in the range
        int missingNumber = missingno(arr, n);
        System.out.println("The missing number is: " + missingNumber);
    }
}
