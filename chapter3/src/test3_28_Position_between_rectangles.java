import java.util.*;
public class test3_28_Position_between_rectangles {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("输入矩形1的中心坐标(x,y)以及矩形的长和宽：");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double w1 = input.nextDouble();
        double h1 = input.nextDouble();
        System.out.print("输入矩形2的中心坐标(x,y)以及矩形的长和宽：");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double w2 = input.nextDouble();
        double h2 = input.nextDouble();
        if (h1 < 0 || h2 < 0 || w1 < 0 || w2 < 0)
            System.out.println("你的输入有误");
        else if ((h1 >= Math.abs(x1 -x2) + h2)
                && (w1 >= Math.abs(y1 -y2) + w2))
            System.out.println("矩形2在矩形1中");
        else if ((h2 >= Math.abs(x1 -x2) + h1)
                && (w2 >= Math.abs(y1 -y2) + w1))
            System.out.println("矩形1在矩形2中");
        else if ((Math.abs(x1 -x2) >= h1 + h2) ||
                (Math.abs(y1 -y2) >= w1 + w2))
            System.out.println("矩形1在矩形2无重叠部分");
        else System.out.println("矩形1和矩形2重叠");
    }
}
//2.5 4 2.5 43  //1 2 3 5.5 //1 2 3 3
//1.5 5 0.5 3  //3 4 4.5 5 //40 45 3 2
