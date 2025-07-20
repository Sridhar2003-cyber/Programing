import java.util.Scanner;
public class oppositenumb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();

        while(n>0){
            int lastdig=n%10;
            System.out.print(lastdig);
            n=n/10;
        }
        System.out.println();
    }
}
