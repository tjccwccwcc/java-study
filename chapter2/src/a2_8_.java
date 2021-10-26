import java.util.*;
public class a2_8_ {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个整型的秒：");
        int seconds = input.nextInt();
        int minutes = seconds/60;
        int remainingSeconds = seconds%60;
        System.out.println(seconds + "秒为" + minutes + "分钟加" + remainingSeconds + "秒");
        System.out.println(Math.pow(2,3));
        System.out.println(Math.pow(4,0.5));
        System.out.println(Math.pow(2.5,2));
        System.out.println(Math.pow(2.5,-2));
        int numberOfYear = 34;
        double weight = 0.305;
        System.out.println(numberOfYear);
        System.out.println(weight);
        System.out.println(0B1111);
        System.out.println(07777);
        System.out.println(0XFFFF);
        System.out.println("1.0/3.0 为" + 1.0/3.0);
        System.out.println("1.0F/3.0F 为" + 1.0F/3.0F);
        long ssn = 232_45_4519;
        long creditCardNumber = 2324_4545_4519_3415L;
        System.out.println(ssn);
        System.out.println(creditCardNumber);
        System.out.print("请输入一个华氏度：");
        double fahrenheit = input.nextDouble();
        double celsius = (5.0/9) * (fahrenheit - 32);
        System.out.println("华氏度为" + fahrenheit + "度，则其摄氏度为" + celsius + "度");
    }
}
