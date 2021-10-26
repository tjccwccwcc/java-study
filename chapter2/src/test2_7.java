import java.util.*;
public class test2_7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of the minutes: ");
        double minutes = input.nextDouble();
        double amountDays = ((minutes / 60.0) / 24.0);
        double years = (amountDays / 365);
        double days = amountDays % 365;
        System.out.print((long)minutes + " minutes is approximately "
                + (int)years + " years " + (int)days + " days");
    }
}
