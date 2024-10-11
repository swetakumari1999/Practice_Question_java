//Given two integer arrays a of size n and b of size m,
//the task is to find the numbers which are present in the first array a, but not present in the second array b.

import java.util.HashMap;
import java.util.HashSet;

public class MissingNoInFisrtArray
{
    static void findMiisingNo(int a[],int b[])
    {
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int num:b)
        {
            hs.add(num);
        }
        for (int num:a)
        {
            if (!hs.contains(num))
            {
                System.out.println("Missing No "+num);
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 10};
        int  b[] = {2, 3, 1, 0, 5};
       // Output:
        //4 10
        //Explanation:
        //4 and 10 are present in first array, but not in second array.
        findMiisingNo(a,b);


    }
}
