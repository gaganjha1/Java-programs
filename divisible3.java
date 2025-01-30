import java.util.*;
public class divisible3 {

    public static void main(String[] args){
Scanner sc = new Scanner (System.in);
System.out.println("Enter a number : ");
int a = sc.nextInt();

if (a%3==0 && a%7==0) {
    System.out.println("This number is divisible by both 3 and 7");
}
else{
    System.out.println("Not divisible by 3 or 7");
}
}
}
