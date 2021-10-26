import java.util.*;
import java.math.*;
public class a2_17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入总钱数(单位：美元)：");
        double amount = input.nextDouble();
        double amountDollar = (int)(amount * 100) / 100;
        double amountQuarter =(int)((amount * 100) % 100) / 25;
        double amountDime = (int)(((amount * 100) % 100) % 25) / 10;
        double amountNickel = (int)((((amount * 100) % 100) % 25) % 10) / 5;
        double amountPenny = (int)((((((amount * 100) % 100) % 25) % 10)) % 5);
        System.out.println("所找的零钱为："+(int)amountDollar+" dollar");
        System.out.println("           "+(int)amountQuarter+" quarter");
        System.out.println("           "+(int)amountDime+" dime");
        System.out.println("           "+(int)amountNickel+" nickel");
        System.out.println("           "+(int)amountPenny+" penny");
        System.out.println(1.0-0.1-0.1-0.1-0.1-0.1);
        System.out.println(1.0-0.9);
        System.out.println(1.0-0.9f);
        System.out.printf("%.1f%n",1.0-0.9);//%n换行
        System.out.println(new BigDecimal("1").subtract(new BigDecimal("0.9")));
        System.out.println(Double.parseDouble(String.format("%.1f",1.0-0.1-0.1-0.1-0.1-0.1)));
        System.out.println(Double.parseDouble(String.format("%.1f",1.0-0.9)));
        //System.out.println((float)1.0-0.1-0.1-0.1-0.1-0.1);无法解决
        //System.out.println((float)1.0-0.9);无法解决
    }
}
