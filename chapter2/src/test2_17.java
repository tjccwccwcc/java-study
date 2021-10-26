import java.util.*;
public class test2_17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58 F and 41 F :");
        double temputer = input.nextDouble();
        System.out.print("Enter the wind speed(>=2) in miles per hour: ");
        double windSpeed = input.nextDouble();
        double windChillIndex = 35.74 + 0.6215 * temputer - 35.75 *
                Math.pow(windSpeed,0.16) + 0.4275 * temputer *
                Math.pow(windSpeed,0.16);
        String windChillIndex5zhong = String.format("%.5f", windChillIndex);
        double windChillIndex5 = Double.parseDouble(windChillIndex5zhong);
        System.out.println("The wind chill index is: " + windChillIndex5);
    }
}
