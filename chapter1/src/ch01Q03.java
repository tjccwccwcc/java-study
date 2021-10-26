import java.util.*;
public class ch01Q03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int number = input.nextInt();
        if (number < 1 || number > 999){
          System.out.println("You must enter a number from 1 to 999");
        };
        for (int row = 1 ; row <= number ; row ++){
            for (int colum = 1 ; colum <= number - row ; colum ++)
                System.out.print("   ");
            for (int quantity = row; quantity >= 1; quantity--)
                System.out.print((quantity >= 100)? quantity :
                        ((quantity >= 10) ? " " + quantity : "  " + quantity));
            for (int quantity = 2; quantity <= row; quantity++)
                System.out.print((quantity >= 100)? quantity :
                        ((quantity >= 10) ? " " + quantity : "  " + quantity));
            System.out.println();
        }
    }
}
