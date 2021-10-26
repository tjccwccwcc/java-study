public class test4_6 {
    public static void main(String args[]) {
        double r = 40;
        double angle = Math.random() * 360;
        double x1 = r * Math.cos(angle * Math.PI / 180);
        double y1 = r * Math.sin(angle * Math.PI / 180);

        double angle1 = Math.random() * 360;
        while (angle1 == angle){angle1 = Math.random() * 360;}
        double x2 = r * Math.cos(angle1 * Math.PI / 180);
        double y2 = r * Math.sin(angle1 * Math.PI / 180);

        double angle2 = Math.random() * 360;
        while (angle2 == angle1 || angle2 == angle){angle2 = Math.random() * 360;}
        double x3 = r * Math.cos(angle2 * Math.PI / 180);
        double y3 = r * Math.sin(angle2 * Math.PI / 180);

        double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));

        double A = Math.toDegrees(Math.acos((a * a - b * b - c * c)
                / (-2 * b * c)));
        double B = Math.toDegrees(Math.acos((b * b - a * a - c * c)
                / (-2 * a * c)));
        double C = Math.toDegrees(Math.acos((c * c - b * b - a * a)
                / (-2 * a * b)));
        double D = A + B + C;
        System.out.print("随机生成的三角形的角度为：");
        System.out.printf("%.2f",A);
        System.out.print(",");
        System.out.printf("%.2f",B);
        System.out.print(",");
        System.out.printf("%.2f",C);
        System.out.println("");
        System.out.print("该三角形的角度和为：");
        System.out.printf("%.0f",D);
    }
}
