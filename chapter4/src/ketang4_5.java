import java.util.*;
public class ketang4_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("请输入一个数n:");
        int n = input.nextInt();
        int round, count = 1, x, y;//round控制圈数，count为每个数赋值
        int[][] array = new int[n][n];
        for (round = 0; round < n / 2; round++) {//大循环表示第几圈
            /* 以下循环执行后输出如下：
                1 2 3 4 5
            */
            x = round;
            for (y = round; y < n-round; y++) {
                array[x][y] = count;
                count++;
            }
             /* 以下循环执行后输出如下：
                1 2 3 4 5
                        6
                        7
                        8
            */
            y = n - round - 1;
            for (x = round + 1; x < n - round - 1; x++) {
                array[x][y] = count;
                count++;
            }
             /* 以下循环执行后输出如下：
                1  2  3  4  5
                            6
                            7
                            8
                13 12 11 10 9
            */
            x = n - round - 1;
            for (y = n - round - 1; y >= round; y--) {
                array[x][y] = count;
                count++;
            }
            /* 以下循环执行后输出如下：
                1  2  3  4  5
                16          6
                15          7
                14          8
                13 12 11 10 9
            */
            y = round;
            for (x = n - round -1-1;x>round;x--){
                array[x][y] = count;
                count++;
            }
            /* 上面的大循环执行后输出如下：
                1  2  3  4  5
                16 17 18 19 6
                15 24    20 7
                14 23 22 21 8
                13 12 11 10 9
            */
        }
        if (n%2==1)
            //如果n值奇数，将最中间的空填上
            array[n/2][n/2] = count;
        for (x = 0; x < n; x++) {
            for (y = 0; y < n; y++) {
                if ((array[x][y]+"").length() == 1)
                    System.out.print(array[x][y]+"   ");
                else if ((array[x][y]+"").length() == 2)
                    System.out.print(array[x][y]+"  ");
                else if ((array[x][y]+"").length() == 3)
                    System.out.print(array[x][y]+" ");
                else if ((array[x][y]+"").length() == 4)
                    System.out.print(array[x][y]+"");
                else System.exit(0);
            }
            System.out.println("");
        }
    }
}
