import java.util.Scanner;
public class ketang4_1 {
    public void snake(int n)
    {
        int[][] data = new int[n][n];
        int A;
        int value = 1;
        if(n % 2 != 0) A = n/2 + 1;    //奇数循环n/2+1次
        else A = n/2;    //偶数循环n/2次
        for(int i = 0; i < A; i++)  //从外向里循环
        {   //从左到右循环
            for(int j = i; j < n - i; j++)
            {
                data[i][j] = value++;
            }
            //右列从上向下循环
            for(int k = i + 1; k < n - i; k++)
            {
                data[k][n-i-1] = value++;
            }
            //从右到左
            for(int l = n-i-2; l >= i; l--)
            {
                data[n-i-1][l] = value++;
            }
            //从下到上
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
        System.out.print("请输入螺旋矩阵的长度：");
        ketang4_1 sn = new ketang4_1();
        while(input.hasNextInt())
        {
            int n = input.nextInt();
            while (n < 1 || n > 20){
                System.out.print("你的输入有误，请重新输入：");
                n = input.nextInt();
            }
            sn.snake(n);
        }
    }
}