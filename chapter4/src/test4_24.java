import java.util.*;
public class test4_24 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();
        System.out.print("Enter the third city: ");
        String city3 = input.nextLine();
        if (city1.compareTo(city2) > 0){
            String zhong1 = "";
            zhong1 = city1;
            city1 = city2;
            city2 = zhong1;
        }
        if (city1.compareTo(city3) > 0){
            String zhong1 = "";
            zhong1 = city1;
            city1 = city3;
            city3 = zhong1;
        }
        if (city2.compareTo(city3) > 0){
            String zhong1 = "";
            zhong1 = city2;
            city2 = city3;
            city3 = zhong1;
        }
        System.out.println("The three cities in alphabetical order are "
                + city1 + " " + city2 + " " + city3);
    }
}
//Chicago
//Los Angeles
//Atlanta