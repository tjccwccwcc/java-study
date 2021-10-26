import java.util.*;
public class test4_8 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        int a = input.nextInt();
        char b = (char)a;
        System.out.println("The character for ASCII code "
                + a + " is " + b);
        System.out.print("Enter an character: ");
        String c = input.next();
        if (c.length() > 1)
            System.out.println("Please enter one character");
        else {
            char d = c.charAt(0);
            int e = (int)d;
            System.out.println("The Unicode for character "
                    + c + " is " + e);
        };
    }
}
