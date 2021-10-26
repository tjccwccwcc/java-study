import java.util.*;
public class test3_5_day_weekday {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("0 for Sunday,1 for Monday,...,6 for Saturday");
        System.out.print("Enter today's day: ");
        int days = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int numberOfDays = input.nextInt();
        int nextDays = (days + numberOfDays)% 7;
        switch (days){
            case 0:System.out.print("Today is Sunday and the future day is ");break;
            case 1:System.out.print("Today is Monday and the future day is ");break;
            case 2:System.out.print("Today is Tuesday and the future day is ");break;
            case 3:System.out.print("Today is Wednesday and the future day is ");break;
            case 4:System.out.print("Today is Thursday and the future day is ");break;
            case 5:System.out.print("Today is Friday and the future day is ");break;
            case 6:System.out.print("Today is Saturday and the future day is ");break;
        }
        switch (nextDays){
            case 0:System.out.println("Sunday");break;
            case 1:System.out.println("Monday");break;
            case 2:System.out.println("Tuesday");break;
            case 3:System.out.println("Wednesday");break;
            case 4:System.out.println("Thursday");break;
            case 5:System.out.println("Friday");break;
            case 6:System.out.println("Saturday");break;
        }
    }
}
