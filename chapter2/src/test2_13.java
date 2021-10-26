import java.util.*;
public class test2_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double savingAmount = input.nextDouble();
        double sum = 0;
        for (int i = 1 ; i <= 6 ; i ++){
            sum = (savingAmount + sum) * (1 + 0.00417);
        }
        //String s = String.format("%.nf", sum);保留n位小数
        String s = String.format("%.2f", sum);
        double v = Double.parseDouble(s);
        System.out.println("After the sixth month, the account value is $" +
                v);
    }
}
