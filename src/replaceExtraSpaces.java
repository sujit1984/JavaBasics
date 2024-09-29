import java.util.Scanner;

public class replaceExtraSpaces {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String new_str = str.replaceAll("\\s+"," ");
        System.out.println(new_str.trim());
    }
}
