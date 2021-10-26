import java.util.*;
public class a2_16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年利率(单位：%)：");
        double yearRate = input.nextDouble();
        double monthRate = yearRate/12.0;
        System.out.print("请输入贷款的额度(单位：元)：");
        double loanLimit = input.nextDouble();
        System.out.print("请输入支付的年数(单位：年)：");
        int years = input.nextInt();
        double monthlyPaymentLimit = (loanLimit * monthRate/100.0)/(1 - 1/Math.pow((1 + monthRate/100.0),years * 12));
        double annualPaymentLimit = monthlyPaymentLimit * years * 12;
        System.out.println("月支付额度为：" + ((int)(monthlyPaymentLimit * 100)/100.0) + "元");
        System.out.print("年支付额度为：" + ((int)(annualPaymentLimit * 100)/100.0) + "元");
    }
}
