import java.util.Scanner;
public class ketang4_2 {
    private static void snake(int n)
    {
        int[][] data = new int[n][n];
        int A;
        int value = 1;
        if(n % 2 != 0) A = n/2 + 1;
        else A = n/2;
        for(int i = 0; i < A; i++)
        {
            for(int j = i; j < n - i; j++)
            {
                data[i][j] = value++;
            }
            for(int k = i + 1; k < n - i; k++)
            {
                data[k][n-i-1] = value++;
            }
            for(int l = n-i-2; l >= i; l--)
            {
                data[n-i-1][l] = value++;
            }
            for(int m = n - i - 2; m > i; m--)
            {
                data[m][i] = value++;
            }
        }
        for(int i = 0; i < n; i++) //遍历输出
        {
            for(int j = 0; j < n; j++)
            {
                if ((data[i][j]+"").length() == 1)
                    System.out.print(data[i][j]+"   ");
                else if ((data[i][j]+"").length() == 2)
                    System.out.print(data[i][j]+"  ");
                else if ((data[i][j]+"").length() == 3)
                    System.out.print(data[i][j]+" ");
                else if ((data[i][j]+"").length() == 4)
                    System.out.print(data[i][j]+"");
                else System.exit(0);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextInt())
        {
            int n = input.nextInt();
            while (n < 1 || n > 20){
                n = input.nextInt();
            }
            snake(n);
        }
    }
}