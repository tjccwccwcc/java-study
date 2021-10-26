import java.util.*;
public class test4_1 {
    public static void main(String[] args){
        /*
        byte b = 'a';
        int i = 'a';
        byte b1 = (byte)'\uFFF4';
        char latter = '\uFFF4';
        System.out.println(b);
        System.out.println(i);
        System.out.println(b1);
        System.out.println(latter);*/
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        double r = input.nextDouble();
        double side = 2 * r * Math.sin(Math.PI / 5);
        double area = 5 * side * side / Math.tan(Math.PI / 5) / 4;
        System.out.print("The area of the pentagon is ");
        System.out.printf("%.2f",area);
    }
}
