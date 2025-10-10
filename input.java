
import java.util.Scanner;

public class input{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age=sc.nextInt();
        sc.nextLine();
System.out.println("your age is" +age);
// string

System.out.println("Enter your name : ");
String name=sc.nextLine();
System.out.println("your name"+name);
    }
}