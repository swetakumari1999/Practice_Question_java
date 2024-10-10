public class MajarityElement
{

    static int majority(int[] arr) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++){
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 3, 2, 34, 55, 678, 66, 4, 4, 3, 11, 11, 88};
        System.out.println(majority(arr));
    }
    }


