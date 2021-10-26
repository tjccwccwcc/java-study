import java.util.*;
public class test3_21_Zeller_consistency {
    public static void zhouji(int q,int m,int j,int k){
        int h = (q + 26 * (m + 1)/10 + k + k/4 + j/4 + 5*j)%7;
        switch (h){
            case 0:System.out.println("今天是周六");break;
            case 1:System.out.println("今天是周天");break;
            case 2:System.out.println("今天是周一");break;
            case 3:System.out.println("今天是周二");break;
            case 4:System.out.println("今天是周三");break;
            case 5:System.out.println("今天是周四");break;
            case 6:System.out.println("今天是周五");break;
            default:
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("输入年：");
        int years = input.nextInt();
        System.out.print("输入月：");
        int months = input.nextInt();
        if (months == 1){months = 13;years = years - 1;}
        if (months == 2){months = 14;years = years - 1;}
        System.out.print("输入日：");
        int days = input.nextInt();
        int j1 = Math.abs(years)/100;
        int k1 = years % 100;
        if ((months == 13 || months == 3 || months == 5 ||
                months == 7 || months == 8 || months == 10
                || months == 12) && (days >= 1 && days <= 31))
            zhouji(days,months,j1,k1);
        else if (months == 2){
            if (((years % 4 == 0 && years % 100 != 0) ||
                    years % 400 == 0) && (days >= 1 && days <= 29))
                zhouji(days,months,j1,k1);
            else if (days >= 1 && days <= 28)zhouji(days,months,j1,k1);
        }
        else if ((months == 4 || months == 6 || months == 9
                || months == 11) && (days >= 1 && days <= 30))
            zhouji(days,months,j1,k1);
        else System.out.print("你输入的日期有误");
    }
}
