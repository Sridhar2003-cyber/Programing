import java.util.Scanner;
public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.print("Enter the value of A:");
      int A=sc.nextInt();
      System.out.print("Enter the value of B:");
      int B=sc.nextInt();
      System.out.print("Enter the value of C:");
      int C=sc.nextInt();
      int max=Math.max(A,Math.max(B,C));
      System.out.print("The maximum number is:"+max);
    }
}
