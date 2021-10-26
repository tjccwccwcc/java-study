import java.util.*;
public class test3_15_Buy_lottery {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number1 = (int)(Math.random() * 1000);
        number1 = (number1 == 1000)? number1 - 1 : number1;
        int d11 = number1/100;
        int d12 = (number1/10) % 10;
        int d13 = number1 % 10;
        System.out.print("请输入你猜的三位整数: ");
        int number2 = input.nextInt();
        int d21 = number2/100;
        int d22 = (number2/10) % 10;
        int d23 = number2 % 10;
        System.out.println("生成的三位数为: " + number1);
        if (d11 == d21 && d12 == d22 && d13 == d23)
            System.out.println("你的奖金为10000美元");
        else if ((d21 == d11 && d22 == d13 && d23 == d12)||
                (d21 == d13 && d22 == d12 && d23 == d11)||
                (d21 == d13 && d22 == d11 && d23 == d12)||
                (d21 == d12 && d22 == d11 && d23 == d13)||
                (d21 == d12 && d22 == d13 && d23 == d11))
            System.out.println("你的奖金为3000美元");
        else if (d21 == d11 || d21 == d12 || d21 == d13
                || d22 == d11 || d22 == d12 || d22 == d13
                || d23 == d11 || d23 == d12 || d23 == d13)
            System.out.println("你的奖金为1000美元");
        else System.out.println("你没有得奖");
    }
}