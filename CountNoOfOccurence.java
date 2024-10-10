import java.util.SortedMap;

public class CountNoOfOccurence
{
    public static void PrintCountOccurence(int arr[], int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                count++;

        }

        System.out.println(count);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,3,4,5,6,7,7,8,9,9,9,9,0};
        int x=9;

        PrintCountOccurence(arr,x);
    }
}
