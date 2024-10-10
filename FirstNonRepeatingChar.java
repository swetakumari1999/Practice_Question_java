public class FirstNonRepeatingChar
{
    public static void main(String[] args) {
        int arr[] = {-1, 3, -1, 2, 0};
        int n = arr.length;
        int temp[] =new int[n];
        int j=0;

        for(int i=0;i<n;i++) {
            boolean b = false;
            for (int k = 0; k < n; k++) {
                if (i != k && arr[i] == arr[k]) {
                    b = true;
                    break;
                }
            }

            if (!b) {
                temp[j++] = arr[i];
            }
        }
        for (int i=0;i<n;i++) {
            System.out.println(temp[i]);
        }

    }
}
