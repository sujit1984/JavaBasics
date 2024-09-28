import java.util.Arrays;

public class PrintingOptions {

    public static void main(String[] args) {

        int x = 10, y =20;
        float a = 12.56f;
        char ch = 'A';
        System.out.println("Sum of " + x+ " and "+y+ " is " + (x+y));
        System.out.printf("Hello %d %c %f World \n",x,ch, a);
        System.out.printf("Hello %x %c %e World \n",x,ch, a);
        System.out.printf(" %1$d %3$e %2$c World \n",x,ch, a);
        System.out.printf(" %05d\n",x);  //displays 10 as 00010

        }

}

