public class test1_4 {
    public static void main(String[] args){//实际上直接一行一行的输入更方便
        System.out.println("a      a^2    a^3");
        for (int i = 1 ; i < 5 ; i++){
            int count = 0;
            int k = i*i;
            int j = i*i*i ;
            if (k > 0 && k < 999999){//计算i*i的位数
                while (k != 0){
                    count ++;
                    k /= 10;
                }
            }
            String str = " ";
            for (j = 0 ; j < 6 - count ; j++){
                str = str + " ";
            }
            System.out.println(i + "      " + i*i + str + i*i*i);
        }
}
}
