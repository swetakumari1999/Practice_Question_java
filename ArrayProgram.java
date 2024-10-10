public class ArrayProgram {
    public static void main(String args[])
    {
        int num1[] = {3,4,5,6};
        int num2[] = new int[6]; // by defalut value consider as 0
        int num3[] = new int[4];

         num3[0] = 4;
         num3[1] = 5;
         num3[2] = 4;
         num3[3] = 7;

         System.out.println(num1[1]);
        System.out.println(num2[0]);
        System.out.println(num3[0]+" "+num3[1]+" "+num3[2]);

        for(int i=0;i<num1.length;i++){
            System.out.println(num1[i]);
        }
    }
}
