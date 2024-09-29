import java.util.Scanner;

public class rmSpecialChars {

    public static void main(String[] args) {

       // String pattern_to_match = "[!@#$%^&*()><,.;:]";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String new_str = str.replaceAll("[^a-zA-Z0-9]","" );
        System.out.println(new_str);
    }
}
