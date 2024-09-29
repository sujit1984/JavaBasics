import java.sql.SQLOutput;
import java.util.Scanner;

public class binaryOrNot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        String str = number +"";
        boolean bin_or_not =  str.matches("[01]+");
        if (bin_or_not){
            System.out.println("Number is binary");
        }
        else {
            System.out.println("Number is not binary");
        }

    }
}
