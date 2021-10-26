import java.util.*;
public class test3_9_10th_digit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int number9 = input.nextInt();
        int d1 = (number9/100000000)%10;
        int d2 = (number9/10000000)%10;
        int d3 = (number9/1000000)%10;
        int d4 = (number9/100000)%10;
        int d5 = (number9/10000)%10;
        int d6 = (number9/1000)%10;
        int d7 = (number9/100)%10;
        int d8 = (number9/10)%10;
        int d9 = (number9)%10;
        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
                d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9)% 11;
        String number99 = d1 + "" + d2 + "" + d3 + "" + d4 + ""
                + d5 + "" + d6 + "" + d7 + "" + d8 + "" + d9;
        if (d10 == 10) System.out.println(number99 + "X");
        else System.out.println(number99 + d10);
    }
}
