/*
This program checks if the IP Address that you provided is actually a valid IPV4 Address or not
Oracle interview question

 */

import java.util.Scanner;

public class regexForIpAddress {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Ip Address: ");
        String ipAddress = sc.nextLine();
        boolean is_ip_addr = ipAddress.matches("^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
        if (is_ip_addr) {
            System.out.println("The ip address is correct");
        }
        else {
            System.out.println("The Ip address is not valid");
        }
    }
}
