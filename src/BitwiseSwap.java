public class BitwiseSwap {


    public static void main(String[] args) {
        int a = 37, b = 24;
        a = a^b ;
        b = a^b;
        a = a^b;
        System.out.println("a is: "+a + " and b is: " +b);
    }
}
