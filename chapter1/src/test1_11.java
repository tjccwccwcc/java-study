public class test1_11 {
    public static void main(String[] args) {
        for (int i = 1 ; i < 6 ; i ++){
            int k = 365 * 24 * 60 * 60 * i;
            double m = (k/7.0) + (k/45.0) - (k/13.0) + 312032468;
            System.out.println("第" + i + "年人口为：" + m);
        }
}
}
