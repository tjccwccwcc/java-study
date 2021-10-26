import java.util.*;
public class c3_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("单身纳税人请输'0'，" +
                "已婚共同纳税人或证实的鏞寡请输'1'，" +
                "已婚单独纳税人请输'2'，" +
                "家庭户主纳税人请输'3'：");
        System.out.print("请输入你的身份：");
        int category = input.nextInt();
        double income;
        if ((category != 0 && category !=1 && category !=2 && category !=3))income = -1;
        else {
            System.out.print("请输入你的收入：");
            income = input.nextDouble();};
        double tax = 0;
        final double category01 = 8350 * 0.1;
        final double category02 = category01 + (33950 - 8350) * 0.15;
        final double category03 = category02 + (82250 - 33950) * 0.25;
        final double category04 = category03 + (171550 - 82250) * 0.28;
        final double category05 = category04 + (372950 - 171550) * 0.33;
        final double category11 = 16700 * 0.1;
        final double category12 = category11 + (67900 - 16700) * 0.15;
        final double category13 = category12 + (137050 - 67900) * 0.25;
        final double category14 = category13 + (208850 - 137050) * 0.28;
        final double category15 = category14 + (372950 - 208850) * 0.33;
        final double category21 = 8350 * 0.1;
        final double category22 = category21 + (33950 - 8350) * 0.15;
        final double category23 = category22 + (68525 - 33950) * 0.25;
        final double category24 = category23 + (104425 - 68525) * 0.28;
        final double category25 = category24 + (186475 - 104425) * 0.33;
        final double category31 = 11950 * 0.1;
        final double category32 = category31 + (45500 - 11950) * 0.15;
        final double category33 = category32 + (117450 - 45500) * 0.25;
        final double category34 = category33 + (190200 - 117450) * 0.28;
        final double category35 = category34 + (372950 - 190200) * 0.33;
        if(category == 0){
            if(income <= 8350) tax = income * 0.1;
            else if(income <= 33950)tax = category01 + (income -8350) * 0.15;
            else if(income <= 82250) tax = category02 + (income - 33950) * 0.25;
            else if(income <= 171550)tax = category03 + (income - 82250) * 0.28;
            else if(income <= 372950)tax = category04 + (income - 171550) * 0.33;
            else tax = category05 + (income - 372950) * 0.35;
        }
        else if(category == 1){
            if(income <= 16700) tax = income * 0.1;
            else if(income <= 67900)tax = category11 + (income -16700) * 0.15;
            else if(income <= 137050) tax = category12 + (income - 67900) * 0.25;
            else if(income <= 208850)tax = category13 + (income - 137050) * 0.28;
            else if(income <= 372950)tax = category14 + (income - 208850) * 0.33;
            else tax = category15 + (income - 372950) * 0.35;
        }
        else if(category == 2){
            if(income <= 8350) tax = income * 0.1;
            else if(income <= 33950)tax = category21 + (income -8350) * 0.15;
            else if(income <= 68525) tax = category22 + (income - 33950) * 0.25;
            else if(income <= 104425)tax = category23 + (income - 68525) * 0.28;
            else if(income <= 186475)tax = category24 + (income - 104425) * 0.33;
            else tax = category25 + (income - 186475) * 0.35;
        }
        else if(category == 3){
            if(income <= 11950) tax = income * 0.1;
            else if(income <= 45500)tax = category31 + (income -11950) * 0.15;
            else if(income <= 117450) tax = category32 + (income - 45500) * 0.25;
            else if(income <= 190200)tax = category33 + (income - 117450) * 0.28;
            else if(income <= 372950)tax = category34 + (income - 190200) * 0.33;
            else tax = category35 + (income - 372950) * 0.35;
        }
        if(income < 0 ){
            System.out.println("你的输入有误");
        }
        else{
            System.out.print("你需要交的税收为：" + Double.parseDouble(String.format("%.1f",tax)));
        };
    }
}
