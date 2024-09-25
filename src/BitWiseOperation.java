public class BitWiseOperation {
    /*This is a program which shows the basic examples of how bitwise operations work.
    * This covers the following operations
    * Bitwise AND, OR
    *
     */
    public static void main(String[] args) {
        int x=10, y=6, z;
        z =x&y; // z =2

        System.out.println(z);
        z = x|y; //z=14
        System.out.println(z);

        z = x^y;

        System.out.println(z);
        x = 0b0001;
        z = x<<1; // o/p will be 2
        System.out.println(z);
        z = x<<2;  //o/p will be 4
        System.out.println(z);

        x = 0b1010;
        z = ~x; //o/p will be -11
        System.out.println(z);
    }
}
