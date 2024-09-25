public class IncDec {

    public static void main(String[] args) {
        int x = 5 , y =4 , z;
        //++x;
        //z = 2 * x++ + 3 * ++y; //Ans = 25
        z = 2 * x++ + 3 * ++x;  //Result = 31
        System.out.println(z);
    }

}
