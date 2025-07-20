import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Range:");
        int range = sc.nextInt();
        
        int i = 0;
        while (i <= range) {
            System.out.println(i + " ");
            i++;
        }
    }
}
