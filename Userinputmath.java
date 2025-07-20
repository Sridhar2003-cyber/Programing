import java.util.Scanner;
public class Userinputmath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number:");
        int a=sc.nextInt();
        System.out.print("Enter Second Number:");
        int b=sc.nextInt();
        System.out.println("The Addition of First and Second Number Is:"+ (a+b));
        System.out.println("The Substraction of First and Second Number Is:"+ (a-b));
        System.out.println("The Multiplication of First and Second Number Is:"+ (a*b));
        System.out.print("The Division of First and Second Number Is:"+ (a/b));


        
    }
}
