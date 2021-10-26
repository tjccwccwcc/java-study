import java.util.*;
public class test2_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal($) and a gratuity rate(%):");
        double subtotalRate = input.nextDouble();
        double gratuityRate = input.nextDouble();
        System.out.println("The gratuity is $" + subtotalRate * gratuityRate / 100.0  +
                "and total is $" + ((subtotalRate * gratuityRate / 100.0) + subtotalRate));
    }
}
