import java.util.*;
public class test2_19 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for a triangle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double bian1 = Math.sqrt(Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2));
        double bian2 = Math.sqrt(Math.pow((x1 - x3),2) + Math.pow((y1 - y3),2));
        double bian3 = Math.sqrt(Math.pow((x3 - x2),2) + Math.pow((y3 - y2),2));
        double s_ = (bian1 + bian2 + bian3)/2;
        double area = Math.sqrt(s_ * (s_ - bian1)
                * (s_ - bian2) * (s_ - bian3));
        System.out.println("The area of the triangle is " +
                Double.parseDouble(String.format("%.1f", area)));
    }
    }
