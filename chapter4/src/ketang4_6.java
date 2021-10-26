import java.util.*;
public class ketang4_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();//方阵大小
        int[][] data = new int[n][n];
        int dire; //当前数字的移动方向
        final int UPRIGHT = 0; //上右
        final int DOWN = 1; // 下
        final int LEFTDOWN= 2; //左下
        final int RIGHT = 3;// 右
        dire = RIGHT;//第一次向右移动
        int value = 1; //数组元素的值
        int row = 0; //第一维下标
        int col = 0; //第二维下标
        data[0][0] = 1; //初始化第一个元素
        data[n-1][n-1] = n*n;
        while(value < n * n-1){
            switch(dire){
                case DOWN:
                    row++; //移动到下一行
                    if(row>=n){ //超过边界
                        row--; //后退
                        dire = RIGHT;
                        continue; //跳过该次循环
                    }
                    else
                    {
                        value++; //数值增加1
                        data[row][col] = value;//赋值
                        if(col==0) {
                            dire = UPRIGHT;
                        }
                        else if(col==n-1){
                            dire = LEFTDOWN;
                        }
                    }
                    break;
                case UPRIGHT:
                    row--;
                    col++; //移动到上一行，右一列
                    if(col>=n)//超过边界
                    {
                        row++;
                        col--; //后退
                        dire = DOWN;
                        continue; //跳过该次循环
                    }
                    else if(row<0){ //超过边界
                        row++;
                        col--; //后退
                        dire = RIGHT;
                        continue; //跳过该次循环
                    } else {
                        value++; //数值增加1
                        data[row][col] = value;//赋值
                        dire = UPRIGHT;
                    }
                    break;
                case RIGHT:
                    col++; //移动到右一列
                    if(col>=n){
                        col--; //后退
                        dire = DOWN;
                        continue; //跳过该次循环
                    }
                    else {
                        value++; //数值增加1
                        data[row][col] = value;//赋值
                        if(row==0) {
                            dire = LEFTDOWN;
                        }
                        else if(row==n-1){
                            dire = UPRIGHT;
                        }
                    }
                    break;
                case LEFTDOWN:
                    row++;
                    col--; //移动到下一行，左一列
                    if(row>=n) { //超过边界
                        row--;col++; //后退
                        dire = RIGHT;
                        continue; //跳过该次循环
                    }else if(col<0)//超过边界
                    {
                        row--;col++; //后退
                        dire = DOWN;
                        continue; //跳过该次循环
                    }
                    else {
                        value++; //数值增加1
                        data[row][col] = value;//赋值
                        dire = LEFTDOWN;
                    }
                    break;
            }
        }
        //输出数组中的元素
        for(int i = 0;i < data.length;i++){
            for(int j = 0;j < data[i].length;j++){
                System.out.printf("%4d",data[i][j]);
            }
            System.out.println();
        }
    }
}
