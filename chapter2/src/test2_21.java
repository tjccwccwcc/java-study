import java.util.*;
public class test2_21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount : ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage : ");
        double annualRate = input.nextDouble();
        System.out.print("Enter number of year : ");
        double years = input.nextDouble();
        double accumulatedValue = investmentAmount *
                Math.pow((1 + annualRate/1200) , years * 12);
        System.out.println("Accumulated Value is $" +
                Double.parseDouble(String.format("%.2f",accumulatedValue)));
    }
}
