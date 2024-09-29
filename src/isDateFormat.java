import java.util.Scanner;

public class isDateFormat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data: ");
        String data = sc.nextLine();
        boolean is_date = data.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}");
        if (is_date){
            System.out.println("The given value is a date:");

        }
        else{
            System.out.println("The given value is not a date");
        }
    }
}
