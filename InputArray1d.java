import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class InputArray1d
{
  public static void main(String args[])
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a size of array");
      int n= sc.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++) {
          System.out.println("Enter value of array");
          arr[i] = sc.nextInt();
      }
      for (int i=0;i<n;i++){
          System.out.println(arr[i]);
      }

  }
}
