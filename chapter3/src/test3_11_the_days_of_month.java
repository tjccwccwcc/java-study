import java.util.*;
public class test3_11_the_days_of_month {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("输入年份: ");
        int years = input.nextInt();
        System.out.print("输入月份: ");
        int months = input.nextInt();
        if (months == 1 || months == 3 || months == 5
                || months == 7 || months == 8
                || months == 10  || months == 12)
            System.out.print(years + "年" +  months + "月共有31天");
        else if (months == 2){
            System.out.print(years + "年" +  months + "月共有" +
                    (((years % 4 == 0 && years % 100 != 0) ||
                            years % 400 == 0)? "29天":"28天"));
        }
        else if (months == 4 || months == 6 || months == 9 || months == 11)
            System.out.print(years + "年" +  months + "月共有30 天");
        else System.out.print("你输入的月份有误");
    }
}
