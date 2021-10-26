import java.util.*;
public class ch01Q01 {
    public static void main(String[] args){
        double a,b,c,d,e,f;
        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();
        double delta = a * d - b * c;
        if (Math.abs(delta) >= 1e-10){
            double x = ((e * d) - (b * f))/delta;
            double y = ((a * f) - (e * c))/delta;
            System.out.println("the result of the equation is, x = "
                    + x + "、y = " + y);
        };
    }
}
