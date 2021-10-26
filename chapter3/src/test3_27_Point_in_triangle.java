import java.util.*;
public class test3_27_Point_in_triangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("输入坐标x和坐标y：");
        double x = input.nextDouble();
        double y = input.nextDouble();
        if (x >= 0 && x <= 200 && y >= 0 &&
                y <= 100 && y <= (-0.5) * x + 100)
            System.out.println("点(" + x + "," + y + ")在该三角形内");
        else System.out.println("点(" + x + "," + y + ")不在该三角形内");
    }
}
