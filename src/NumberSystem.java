

public class NumberSystem {

    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 0b1010;
        byte b3 = 012;
        byte b4 = 0XA;
        int x = 5;
        int y = -5;
        //String s = Integer.toBinaryString(x);
        char ch = 0x03C9;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(y));
        System.out.println(ch);

        for (char c = 0x0900 ; c < 0x0970; c ++)
            System.out.print(c + "  ");

    }

}
