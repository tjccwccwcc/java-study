import java.util.*;
public class test3_17_the_finger_guessing_game {
    public static void qaiquan(int num){
        if (num == 0)System.out.print("出石头，");
        if (num == 1)System.out.print("出剪刀，");
        if (num == 2)System.out.print("出布，");
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number1 = (int)(Math.random() * 3) % 3;
        System.out.print("请输入你的出拳，0-石头，1-剪刀，2-布：");
        int number2 = input.nextInt();
        if (number2 != 0 && number2 != 1 && number2 != 2)
            System.out.println("你的输入有误");
        else if (number1 == number2){
            System.out.print("电脑");qaiquan (number1);
            System.out.print("你也");qaiquan (number2);
            System.out.print("平局");
        }
        else if (number1 - number2 == 1 ||
                (number1 == 0 && number2 == 2)){
            System.out.print("电脑");qaiquan (number1);
            System.out.print("你");qaiquan (number2);
            System.out.print("你赢了");
        }
        else{
            System.out.print("电脑");qaiquan (number1);
            System.out.print("你");qaiquan (number2);
            System.out.print("你输了");
        }
    }

}
