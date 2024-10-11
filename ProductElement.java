class Sol
{
    public static long productElement(int arr[])
    {
        long result=1;
        int mod = 1000000007;
        for (int i=0;i<arr.length;i++)
        {
         result = (result*arr[i])% mod;
        }
        return result%mod;
    }
}
public class ProductElement
{
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6};
        System.out.println(Sol.productElement(arr));
    }
}
