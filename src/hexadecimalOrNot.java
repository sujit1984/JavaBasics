import java.util.Scanner;

public class hexadecimalOrNot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String number = sc.nextLine();
        //String str = String.valueOf(number);
        boolean hex_or_not = number.matches("[0-9A-F]+");
        if(hex_or_not){
            System.out.println("Number is a hexadecimal");
        }
        else{
            System.out.println("Number is not hexadecimal");
        }
    }
}
