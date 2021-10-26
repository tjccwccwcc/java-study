import java.util.*;
public class test3_22_Point_in_circle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("输入坐标x和坐标y：");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double distance = Math.sqrt(x * x + y * y);
        if (distance <= 10 || Math.abs(distance - 10) < 1e-10)
            System.out.println("点(" + x + "," + y + ")在圆内");
        else System.out.println("点(" + x + "," + y + ")不在圆内");
    }
}
