import java.util.Scanner;

public class Cuboid {

    public static void main(String[] args) {
        int length, breadth, height;
        int totalArea, Volume;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length, breadth and height of the cuboid in cm");
        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();
        Volume = length * breadth * height;
        System.out.println("The volume of the cuboid is: " +Volume + " cu.cm");
        int frontAndBackArea = length * height;
        int rightAndLeftArea = breadth * height;
        int bottomAndTopArea = length * breadth;

        totalArea = (2*frontAndBackArea) + (2*rightAndLeftArea) + (2*bottomAndTopArea);
        System.out.println("Total Area of the cuboid is: " +totalArea + " sq.cm");
    }
}
