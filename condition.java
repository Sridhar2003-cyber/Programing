import java.util.Scanner;
public class condition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Age:");
        int age=sc.nextInt();
        if(age>=3 && age<=9){
            System.out.print("Shantam is Child\n");
            System.out.print("Shantam can't Talk and walk");
        }else if(age>=10 && age<=17){
            System.out.print("Shantam is not Adult\n");
            System.out.print("Shantam is not eligible to fuck");
        }else if(age>=18 && age<=64){
            System.out.print("Shantam is Adult and He can Fuck Sathi");
        }else if(age>=65){
            System.out.print("Shantam id Eligible for death");
        }else{
            System.out.print("Shantam is a Baby Boy");
    }
}
}
