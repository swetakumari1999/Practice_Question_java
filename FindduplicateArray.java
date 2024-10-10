public class FindduplicateArray {
    public static void main(String args[]) {
        int arr[] = {2, 3, 4, 5, 4, 3, 5, 6, 7, 4, 1};
        int result;

        for (int i=0;i<arr.length;i++)
        {
            System.out.println("Original array "+arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("After finding duplicate array "+arr[i]);
                    break;
                }
            }
        }


    }
}
