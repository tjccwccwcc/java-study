import java.util.*;
public class ketang4_9 {
    public static long getDigit(long number){
        String number1 = number + "";
        String number2 = "";
        int number4 = 0;
        for (int i = 0; i < number1.length(); i ++){
            String number3 = number1.charAt(i)+"";
            if(2 * Integer.parseInt(number3) > 9){
                number4 = (2 * Integer.parseInt(number3))/10 +
                        2 * Integer.parseInt(number3) - 10;
                number2 = number2 + number4;
            }
            else number2 = number2 + 2 * Integer.parseInt(number3);
        }
        return Long.parseLong(number2);
    }
    public static int sumOfDoubleEvenPlace(long number){
        String number1 = getDigit(number) + "";
        int number4 = 0;
        for (int i = 0; i < number1.length(); i = i + 2){
            String number3 = number1.charAt(i)+"";
            number4 = number4 + Integer.parseInt(number3);
        }
        return number4;
    }
    public static int sumOfOddPlace(long number){
        String number1 = number + "";
        int number4 = 0;
        for (int i = 1; i < number1.length(); i = i + 2){
            String number3 = number1.charAt(i)+"";
            number4 = number4 + Integer.parseInt(number3);
        }
        return number4;
    }
    public static long getPrefix(long number, int k) {
        long result = number;
        for (int i = 0; i < getSize(number) - k; i++)
            result /= 10;
        return result;
    }
    public static int getSize(long d) {
        int numberOfDigits = 0;
        while (d != 0) {
            numberOfDigits++;
            d = d / 10;
        }
        return numberOfDigits;
    }
    public static boolean prefixMatched(long number, int d) {
        return getPrefix(number, getSize(d)) == d;
    }
    public static boolean isValid(long number) {
        return  (getSize(number) >= 13) && (getSize(number) <= 16) &&
                (prefixMatched(number, 4) || prefixMatched(number, 5) ||
                        prefixMatched(number, 6) || prefixMatched(number, 37)) &&
                (sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入信用卡号：");
        long number = input.nextLong();
        if (isValid(number))
            System.out.println("卡号" + number + "是合法的");
        else
            System.out.println("卡号" + number + "是不合法的");
    }
}
//4005550000000019
//4388576018410707
//4388576018402626