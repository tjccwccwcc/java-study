import java.util.*;
public class a2_13 {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = (totalHours + 8) % 24;
        System.out.println(totalMilliseconds);
        System.out.println("目前的北京时间为" + currentHour + ":" + currentMinute + ":" + currentSecond);
        int i = 1;
        int j;
        j = i ++;
        System.out.println(i);
        System.out.println(j);
        i = 1;
        j = ++ i;
        System.out.println(i);
        System.out.println(j);
        System.out.println((int)1.7);
        System.out.println((int)0.7);
        System.out.println((double)1/2);
        System.out.println(1/2);
        double d = 4.5;
        int nb = (int)d;
        System.out.println(nb);
        int sum = 0;
        sum += 4.5;
        System.out.println(sum);
        int x = 1;
        byte y = (byte) x;
        System.out.println(y);
    }
}
