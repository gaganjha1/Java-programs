
import java.util.Scanner;

public class Operations { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Numbers entered are "+a +b);
        System.out.println("sum of the numbers is "+(a+b));
        System.out.println("Difference of the numbers is "+(a-b));
        System.out.println("Product of the numbers is "+(a*b));
        System.out.println("Remainder of the numbers is "+(a/b));
        
    }
    
}
