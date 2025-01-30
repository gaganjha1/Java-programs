import java.util.*;

public class Operation {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int b = sc.nextInt();
        System.out.print("Enter operator + - * / : ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Sum is : "+(a+b));
                break;
                case '-':
                System.out.println("Subtraction is : "+(a-b));
                break;
                case '*':
                System.out.println("Product is : "+(a*b));
                break;
                case '/':
                System.out.println("Remainder is : "+(a/b));
                break;
        }
        
    }
    
}
