import java.util.*;
public class ketang4_10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入字符串：");
        String s = input.nextLine();
        char ch = 0;
        System.out.print("按键输入为：");
        for (int i = 0 ; i < s.length() ; i++){
            ch = s.charAt(i);
            switch (Character.toUpperCase(ch)){
                case '0':System.out.print("0");break;
                case '1':System.out.print("1");break;
                case '2':System.out.print("2");break;
                case '3':System.out.print("3");break;
                case '4':System.out.print("4");break;
                case '5':System.out.print("5");break;
                case '6':System.out.print("6");break;
                case '7':System.out.print("7");break;
                case '8':System.out.print("8");break;
                case '9':System.out.print("9");break;
                case 'A':System.out.print("22");break;
                case 'B':System.out.print("222");break;
                case 'C':System.out.print("2222");break;
                case 'D':System.out.print("33");break;
                case 'E':System.out.print("333");break;
                case 'F':System.out.print("3333");break;
                case 'G':System.out.print("44");break;
                case 'H':System.out.print("444");break;
                case 'I':System.out.print("4444");break;
                case 'J':System.out.print("55");break;
                case 'K':System.out.print("555");break;
                case 'L':System.out.print("5555");break;
                case 'M':System.out.print("66");break;
                case 'N':System.out.print("666");break;
                case 'O':System.out.print("6666");break;
                case 'P':System.out.print("77");break;
                case 'Q':System.out.print("777");break;
                case 'R':System.out.print("7777");break;
                case 'S':System.out.print("77777");break;
                case 'T':System.out.print("88");break;
                case 'U':System.out.print("888");break;
                case 'V':System.out.print("8888");break;
                case 'W':System.out.print("99");break;
                case 'X':System.out.print("999");break;
                case 'Y':System.out.print("9999");break;
                case 'Z':System.out.print("99999");break;
                case ' ':System.out.print("00");break;
                case '+':System.out.print("**");break;
                case '*':System.out.print("*");break;
                default: System.out.println(ch + "is an invalid input ");
                    System.exit(1);
            }
        }
    }
}
//covid 2019 is an american virus