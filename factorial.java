import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        int number;
        long Fctl=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number:");
        number=sc.nextInt();
        for(int i=1;i<=number;i++){
            Fctl=Fctl*i;
            
        }System.out.println("\nFactorial of number "+number+" is: "+Fctl);


    }
}
