//Given a sorted array arr containing n elements with possibly some duplicate,
//the task is to find the first and last occurrences of an element x in the given array.

import java.util.ArrayList;

class Solution {
    ArrayList<Integer> occurrence(int arr[], int n, int x)
    {

        ArrayList<Integer> list = new ArrayList<>();
        int firstIndex = -1;
        int lastIndex = -1;

        // Find the first occurrence
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                firstIndex = i;
                break;
            }
        }

        // Find the last occurrence
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == x) {
                lastIndex = i;
                break;
            }
        }

        // Add indices to the list
        if (firstIndex != -1) {
            list.add(firstIndex);
        }
        if (lastIndex != -1) {
            list.add(lastIndex);
        }

        return list;
    }

}

public class OccurenceofFirstandLast

{
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int n = arr.length; // Set n to the length of the array
        int x = 5;
        Solution solution = new Solution();
        System.out.println(solution.occurrence(arr, n, x));
    }
}
