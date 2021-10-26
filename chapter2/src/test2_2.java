import java.util.*;
public class test2_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder:");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        System.out.println("The area is:" + radius * radius * Math.PI);
        System.out.println("The volume is:" + radius * radius * Math.PI *length);
    }
}
