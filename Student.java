import java.util.Scanner;

class Student {
    public static void main(String args[]) {
        String name, address, course;
        int rollno;
        char section;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name:");
        name = sc.nextLine();

        System.out.println("Enter Your Roll Number:");
        rollno = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Your Address:");
        address = sc.nextLine();

        System.out.println("Enter Your Course:");
        course = sc.nextLine();

        System.out.println("Enter Your Class Section (e.g., A, B, etc.):");
        section = sc.next().charAt(0);

        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Address: " + address);
        System.out.println("Course: " + course);
        System.out.println("Section: " + section);

        sc.close();
    }
}
