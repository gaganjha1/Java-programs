import java.util.*;
public class divisible5 {

    public static void main(String[] args){
Scanner sc = new Scanner (System.in);
System.out.println("Enter a number : ");
int a = sc.nextInt();

String result = (a%5 == 0) ? "Divisible by 5" : "Not divisible by 5";
System.out.println(result);

}
}
