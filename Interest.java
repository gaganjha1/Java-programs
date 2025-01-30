import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter principal, rate, and time:");
            float p = sc.nextFloat(); 
            float r = sc.nextFloat(); 
            float t = sc.nextFloat(); 

            float simpleInterest = (p * r * t) / 100;
            System.out.println("Simple interest is: " + simpleInterest);
        }
    }
}
