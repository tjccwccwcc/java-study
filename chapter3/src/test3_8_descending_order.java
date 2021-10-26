import java.util.*;
public class test3_8_descending_order {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three number: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        if (number1 > number2){
            double temp = number1;
            number1 = number2;
            number2 = temp;
        }
        if (number1 > number3){
            double temp1 = number1;
            number1 = number3;
            number3 = temp1;
        }
        if (number2 > number3){
            double temp2 = number2;
            number2 = number3;
            number3 = temp2;
        }
        System.out.println("The three numbers in non descending order are :" +
                number1 + "," + number2 + "," + number3);
    }
}
