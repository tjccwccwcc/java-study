import java.util.*;
public class test2_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();
        //int seconds = 365 * 24 * 60 * 60 * (years - years % 4) +
        //        366 * 24 * 60 * 60 * (years % 4);
        int seconds = 365 * 24 * 60 * 60 * years;
        double totalpopulation = (seconds/7) + (seconds/45) - (seconds/13) + 312032486;
        System.out.println("The population in " + years + " years is " + (long)totalpopulation);
    }
}
