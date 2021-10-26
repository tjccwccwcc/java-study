import java.util.*;
public class c3_7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年份：");
        int years = input.nextInt();
        System.out.println(((years % 4 == 0 && years % 100 != 0)||years % 400 == 0)
                ? "year " + years + " is a LeapYear? Yes"
                : "year " + years + " is a LeapYear? No");
    }
}
