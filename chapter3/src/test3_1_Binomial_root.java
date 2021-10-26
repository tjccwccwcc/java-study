import java.util.*;
public class test3_1_Binomial_root {
    public static double keepValidNumbers(double nums ,int n){
        //保留有效位数字，nums为数字，n为有效位数
        if (nums == 0)return 0;
        final double weiShu = Math.ceil(Math.log10(nums < 0 ? -nums : nums));
        final int xiaoShuWei = n - (int)weiShu;
        final double magnitude = Math.pow(10,xiaoShuWei);
        final long shifted = Math.round(nums * magnitude);
        return shifted/magnitude;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a,b,c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double discriminant = Math.pow(b,2) - 4 * a * c;
        if (discriminant < 1e-10)
            System.out.println("The equation has no real roots");
        else
        {
            double root1 = (- b + Math.pow(discriminant,0.5))/(2 * a);
            double root2 = (- b - Math.pow(discriminant,0.5))/(2 * a);
            //double root16 = Double.parseDouble(String.format("%.6f",root1));
            //double root26 = Double.parseDouble(String.format("%.6f",root2));
            double root16 = keepValidNumbers(root1 , 6);
            double root26 = keepValidNumbers(root2 , 6);
            System.out.println((Math.abs(discriminant) >= 1e-10) ?
                    "The equation has two roots " + root16 + " and " + root26
                    :"The equation has one root" + root16);
        }
    }
}
