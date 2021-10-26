import java.util.*;
public class test3_34_Point_line_position {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("输入三个点的坐标p0(x0,y0),p1(x1,y1),p2(x2,y2)：");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double discriminant = (x1 -x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        if (discriminant > 0)System.out.println("p2在线段p0p1的左侧");
        else if (discriminant < 0)System.out.println("p2在线段p0p1的右侧");
        else if (discriminant == 0 && ((x0 <= x2 && x2 <= x1)
                && (y0 <= y2 && y2 <= y1)) || ((x1 <= x2 && x2 <= x0)
                && (y1 <= y2 && y2 <= y0)))System.out.println("p2在线段p0p1上");
        else System.out.println("p2在直线p0p1上，且不在线段p0p1上");
    }
}
//4.4 2 6.5 9.5 -5 4    //1 1 5 5 2 2    //3.4 2 6.5 9.5 5 2.5
//1 1 2.5 2.5 1.5 1.5    //1 1 2 2 3.5 3.5
