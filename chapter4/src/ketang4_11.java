import java.util.*;
public class ketang4_11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入信用卡号：");
        long number = input.nextLong();
        if (isValid(number))
            System.out.println("卡号" + number + "是合法的");
        else
            System.out.println("卡号" + number + "是不合法的");
    }
    public static boolean isValid(long number) {
        return  (getSize(number) >= 13) && (getSize(number) <= 16) &&
                (prefixMatched(number, 4) || prefixMatched(number, 5) ||
                        prefixMatched(number, 6) || prefixMatched(number, 37)) &&
                (sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0;
    }
    public static int sumOfDoubleEvenPlace(long number) {
        int result = 0;
        number = number / 10;
        while (number != 0) {
            result += getDigit((int)((number % 10) * 2));
            number = number / 100;
        }
        return result;
    }
    public static int getDigit(int number) {
        return number % 10 + (number / 10);
    }
    public static int sumOfOddPlace(long number) {
        int result = 0;
        while (number != 0) {
            result += (int)(number % 10);
            number = number / 100; // Move two positions to the left
        }
        return result;
    }
    public static boolean prefixMatched(long number, int d) {
        return getPrefix(number, getSize(d)) == d;
    }
    public static int getSize(long d) {
        int numberOfDigits = 0;
        while (d != 0) {
            numberOfDigits++;
            d = d / 10;
        }
        return numberOfDigits;
    }
    public static long getPrefix(long number, int k) {
        long result = number;
        for (int i = 0; i < getSize(number) - k; i++)
            result /= 10;
        return result;
    }
}
//4005550000000019
//4388576018410707
//4388576018402626