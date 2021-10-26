import java.util.*;
public class test3_23_Point_in_rectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("输入坐标x和坐标y：");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double distance1 = Math.abs(x);
        double distance2 = Math.abs(y);
        if (distance1 <= 5 && distance2 <= 2.5 ||
                (Math.abs(distance1 - 5) < 1e-10 &&
                        Math.abs(distance2 - 2.5) < 1e-10))
            System.out.println("点(" + x + "," + y + ")在矩形内");
        else System.out.println("点(" + x + "," + y + ")不在矩形内");
    }
}
