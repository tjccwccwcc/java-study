import java.util.*;
public class test2_22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入总钱数(单位：美元)：");
        double amount = input.nextDouble();
        int amount100 = Integer.parseInt(String.format("%.0f",amount * 100));
        double amountDollar = (int)(amount100) / 100;
        double amountQuarter =(int)((amount100) % 100) / 25;
        double amountDime = (int)(((amount100) % 100) % 25) / 10;
        double amountNickel = (int)((((amount100) % 100) % 25) % 10) / 5;
        double amountPenny = (((((amount100) % 100) % 25) % 100)) % 5;
        System.out.println("所找的零钱为："+(int)amountDollar+" dollar");
        System.out.println("           "+(int)amountQuarter+" quarter");
        System.out.println("           "+(int)amountDime+" dime");
        System.out.println("           "+(int)amountNickel+" nickel");
        System.out.println("           "+(int)amountPenny+" penny");
    }
}
