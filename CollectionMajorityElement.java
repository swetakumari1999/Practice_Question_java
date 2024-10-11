class  MajorityElement {
    public static int majority(int arr[]) {
        int element = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                count = 1;
                element = arr[i];
            } else if (element == arr[i])
                count++;
            else count--;

        }
        int count2 = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == element)
                count2++;
            return (count2 > arr.length / 2) ? element : -1;

    }
}
public class CollectionMajorityElement {
    public static void main(String[] args) {
        int arr[] = {3, 1, 3, 3, 2};
       System.out.println(MajarityElement.majority(arr));
    }
}

