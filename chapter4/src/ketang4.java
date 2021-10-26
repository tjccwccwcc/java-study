import java.util.*;
public class ketang4 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int dict1 = (int)(Math.random()*10);
        while (dict1 ==0){dict1 = (int)(Math.random()*10);}
        int dict2 = (int)(Math.random()*10);
        int dict3 = (int)(Math.random()*10);
        int dict4 = (int)(Math.random()*10);
        System.out.println("" + dict1 + dict2 + dict3 + dict4);
        int sum = 0;
        int d1 = 10;
        int d2 = 10;
        if (dict1 == dict2 && dict2 == dict3 && dict3 == dict4){
            sum = 4;
            d1 = dict1;
        }
        else if ((dict1 == dict2 && dict2 == dict3) ||
                (dict1 == dict2 && dict2 == dict4) ||
                (dict1 == dict3 && dict3 == dict4)){
            sum = 3;
            d1 = dict1;
        }
        else if (dict2 == dict3 && dict3 == dict4){
            sum = 3;
            d1 = dict2;
        }
        else if (dict1 == dict2 || dict1 == dict3 ||
                dict1 == dict4){
            sum = 2;
            d1 = dict1;
            if (dict1 == dict4 && dict2 == dict3)
                d2 = dict2;
            else if (dict1 == dict3 && dict2 == dict4)
                d2 = dict2;
            else if (dict1 == dict2 && dict3 == dict4)
                d2 = dict3;
        }
        else if (dict2 == dict3 || dict2 == dict4){
            sum = 2;
            d1 = dict2;
            if (dict1 == dict4 && dict2 == dict3)
                d2 = dict1;
            else if (dict1 == dict3 && dict2 == dict4)
                d2 = dict1;
        }
        else if (dict3 == dict4){
            sum = 2;
            d1 = dict3;
            if (dict1 == dict2)
                d2 = dict1;
        }
        else sum = 1;
        int A = 0,B = 0,i = 0;
        while (A != 4){
            System.out.print("请输入你猜的四位数：");
            String s = input.nextLine();
            while (s.length() != 4){
                System.out.print("你的输入有误，请输入四位数：");
                s = input.nextLine();
            }
            int dict11 = s.charAt(0) - '0';
            int dict12 = s.charAt(1) - '0';
            int dict13 = s.charAt(2) - '0';
            int dict14 = s.charAt(3) - '0';
            A = 0;
            B = 0;
            i = i + 1;
            if (dict11 == dict1) A = A + 1;
            if (dict12 == dict2) A = A + 1;
            if (dict13 == dict3) A = A + 1;
            if (dict14 == dict4) A = A + 1;
            if (dict11 != dict1 && (dict11 == dict2 ||
                    dict11 == dict3 || dict11 == dict4))
                B = B + 1;
            if (dict12 != dict2 && (dict12 == dict1
                    || dict12 == dict3 || dict12 == dict4)){
                if (dict12 != dict11) B = B + 1;
                else if (sum == 2 && dict12 == d1) B = B + 1;
                else if (sum == 2 && dict12 == d2) B = B + 1;
                else if (dict12 == dict1) B = B + 1;
            }
            if (dict13 != dict3 && (dict13 == dict1 || dict13 ==
                    dict2 || dict13 == dict4)){
                if (dict13 != dict11 && dict13 != dict12) B = B + 1;
                else if (sum == 2 && dict13 == d1) B = B + 1;
                else if (sum == 2 && dict13 == d2) B = B + 1;
                else if (sum == 3 && dict13 == d1)B = B + 1;
                else if (dict13 == dict1 && dict12 != dict1) B = B + 1;
                else if (dict13 == dict2 && dict11 != dict2) B = B + 1;
            }
            if (dict14 != dict4 && (dict14 == dict1 || dict14 ==
                    dict2 || dict14 == dict3)){
                if (dict14 != dict11 && dict14 != dict12 &&
                        dict14 != dict13)B = B + 1;
                else if (sum == 2 && dict14 == d1){
                    B = B + 1;
                    if (dict11 != dict1 && dict12 != dict2 && dict13 != dict3 &&
                            (dict11 == d2 || dict12 == d2 || dict13 == d1) &&
                            (dict11 == d2 || dict12 == d1 || dict13 == d2) &&
                            (dict11 == d1 || dict12 == d2 || dict13 == d2) && B<=4)
                        B = B + 1;
                }
                else if (sum == 2 && dict14 == d2){
                    B = B + 1;
                    if (dict11 != dict1 && dict12 != dict2 && dict13 != dict3 &&
                            (dict11 == d2 || dict12 == d1 || dict13 == d1) &&
                            (dict11 == d1 || dict12 == d2 || dict13 == d1) &&
                            (dict11 == d1 || dict12 == d1 || dict13 == d2) && B<=4)
                        B = B + 1;
                }
                else if (sum == 3 && dict14 == d1)B = B + 1;
                else if (sum == 4 && dict14 == d1)B = B + 1;
                else if (dict14 == dict1 && dict12 != dict1 && dict13 != dict1)B = B + 1;
                else if (dict14 == dict2 && dict11 != dict2 && dict13 != dict2)B = B + 1;
                else if (dict14 == dict3 && dict11 != dict3 && dict12 != dict3)B = B + 1;
            }
            System.out.println(i + ":" + A + "A" + B + "B");
        }
        System.out.println(A + "A" + B + "B");
        System.out.println("你很厉害啊!");
    }
}
