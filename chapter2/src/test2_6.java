import java.util.*;
public class test2_6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000:");
        int number = input.nextInt();
        int number1 = number / 1000;
        int number2 = (number % 1000) / 100;
        int number3 = (number % 100) / 10;
        int number4 = (number % 10);
        System.out.println("The sum of the digits is " +
                (number1 + number2 + number3 + number4));
    }
}
