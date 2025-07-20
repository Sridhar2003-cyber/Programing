import java.util.Scanner;
public class Userinpur {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the value of P:");
      int P=sc.nextInt();
      System.out.print("Enter the value of R:");
      int R=sc.nextInt();
      System.out.print("Enter the value of T:");
      int T=sc.nextInt();
      int interest=P*R*T/100;
      System.out.println("The interest amount is:"+interest);
    }
}