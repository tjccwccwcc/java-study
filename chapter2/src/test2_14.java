import java.util.*;
public class test2_14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weightPounds = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double heightInches = input.nextDouble();
        double weightkg = weightPounds * 0.45359237;
        double heightmeter = heightInches * 0.0254;
        double BMI = weightkg / (heightmeter * heightmeter);
        String BMI4zhong = String.format("%.4f", BMI);
        double BMI4 = Double.parseDouble(BMI4zhong);
        /*
        //麻烦，当舍弃小数时使用
        double sum_2 = 0;
        if (((BMI * 100000) % 10) < 5){sum_2 = (int)(BMI * 10000)/10000.0;}
        else {sum_2 = (((int)(BMI * 10000)/10000.0) * 10000 + 1)/10000.0;};
        */
        System.out.println("BMI is " + BMI4);
    }
}
