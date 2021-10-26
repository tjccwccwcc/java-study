import java.util.*;
public class test3_19_Triangle_perimeter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("输入三角形的三条边：");
        double bian1 = input.nextDouble();
        double bian2 = input.nextDouble();
        double bian3 = input.nextDouble();
        double zhouchan = bian1 + bian2 + bian3;
        if ((bian1 + bian2 > bian3) &&
                (bian2 + bian3 > bian1) &&
                (bian1 + bian3) > bian2)
            System.out.println("该三角形周长为: " + zhouchan);
        else System.out.println("你输入的三条边无法构成三角形");
    }
}
