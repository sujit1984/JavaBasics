import java.util.*;
public class InputData {



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 2 numbers ");
        int a, b, c;
        a = s.nextInt();
        b = s.nextInt();
        c = a+b;

        System.out.println("Sum of the two numbers is: " +c);
        String name;

        System.out.println("Enter the name:");
        name = s.nextLine();
        System.out.println("The name is " +name);

    }
}
