import java.util.*;
public class test2_20 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balanceRate = input.nextDouble();
        double interestRate = input.nextDouble();
        double interest = balanceRate * (interestRate/1200);
        System.out.println("The interest is " +
                Double.parseDouble(String.format("%.5f",interest)));
    }
}
