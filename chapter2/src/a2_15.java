import java.util.*;
public class a2_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("输入营业值:");
        double purchaseAmount = input.nextDouble();
        double tax = purchaseAmount * 0.06;
        System.out.println("营业税值为:" + (int)(tax * 100) / 100.0);//进两位取整，两位后的小数被删除
        System.out.println(1.0/3);
        System.out.println(1/3.0);
        System.out.println((int)(1/3.0 * 100)/100.0);
    }
}
