import java.util.Scanner;
public class DoWhile1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=0;
        do{
            System.out.print("Input a Number:");
            number=sc.nextInt();
            System.out.print("Here is your number: ");
            System.out.println(number);
        }while(number>=0 && number<=100);
        System.out.println("The End");
    }
}