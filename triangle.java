import java.util.*;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st side of triangle : ");
        int a = sc.nextInt();

        System.out.println("Enter 2nd side of triangle : ");
        int b = sc.nextInt();

        System.out.println("Enter 3rd side of triangle : ");
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("This is an equilateral triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("This is an isosceles triangle");
        } else {
            System.out.println("This is a scalene triangle");
        }

        sc.close();
    }
}