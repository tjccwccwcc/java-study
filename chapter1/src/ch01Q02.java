import java.util.Scanner;
public class ch01Q02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int number = input.nextInt();
        if (number < 1 || number > 15){
            System.out.println("You must enter a number from 1 to 15");
        };
        for (int row = 1 ; row <= number ; row ++){
            for (int colum = 1 ; colum <= number - row ; colum ++){
                System.out.print(" ");
            };
            for (int quan = 1 ; quan <= 2 * row - 1 ; quan ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
