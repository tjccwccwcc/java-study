import java.util.*;
public class ketang4_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number1 = input.nextInt();
        /*while (number1 > 14){
            System.out.print("Please re-enter a number: ");
            number1 = input.nextInt();
        }
         */
        int number = 0; // Number to print
        String length1 = Math.pow(2, number1) + "";
        int length = length1.length();
        for (int row = 0; row <= number1 - 1 ; row++) {
            for (int col = 1; col <= number1 - 1 - row; col++)
                System.out.printf("%"+length+"s", " ");
            for (int col = 0; col <= row; col++) {
                number = (int) Math.pow(2, col);
                System.out.printf("%"+length+"d", (long)number);
            }
            for (int col = row - 1; col >= 0; col--) {
                number = (int) Math.pow(2, col);
                System.out.printf("%"+length+"d", (long)number);
            }
            System.out.print('\n');
        }
    }
}
