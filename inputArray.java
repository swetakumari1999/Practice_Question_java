import java.util.Scanner;

public class inputArray {
    public static void main(String args[])
    {

     int row, col;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many row and col you want");
        row = sc.nextInt();
        col = sc.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("Insert the matrix value:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++) {
                arr[i][j] = sc.nextInt();

            }
            }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }

    }
}
