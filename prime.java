import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int number = sc.nextInt();

        boolean isprime=true;
        for(int i=2;i<=number-1;i++){
            if(number%i==0){
                isprime=false;
             }
        }
        if(isprime==true){
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is not prime");
        }
    }
}