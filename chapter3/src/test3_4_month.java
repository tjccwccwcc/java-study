import java.util.*;
public class test3_4_month {
    public static void main(String[] args){
        int randomNumber = (int)(12 * Math.random());
        System.out.println(randomNumber);
        randomNumber = (randomNumber == 0) ? randomNumber + 1 : randomNumber;
        switch (randomNumber){
            case 1:System.out.println("January");break;
            case 2:System.out.println("February");break;
            case 3:System.out.println("March");break;
            case 4:System.out.println("April");break;
            case 5:System.out.println("May");break;
            case 6:System.out.println("June");break;
            case 7:System.out.println("July");break;
            case 8:System.out.println("August");break;
            case 9:System.out.println("September");break;
            case 10:System.out.println("October");break;
            case 11:System.out.println("November");break;
            case 12:System.out.println("December");break;
            default:System.out.println("程序错误");System.exit(1);
        }
    }
}
