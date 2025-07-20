import java.util.Scanner;

public class Userinput {

    public static void main(String[] args)  {
        System.out.print("Enter a number:");
        Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();

        System.out.println("GST BILL :"+ (a*18/100));
    sc.close();
    }
}