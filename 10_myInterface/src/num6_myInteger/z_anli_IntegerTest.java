package num6_myInteger;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;

public class z_anli_IntegerTest {
    public static void main(String[] args) {
        String s = "55 89 78 56 34 46 88";
        System.out.println(s);
        String[] s1 = s.split(" ");
        int[] numbers = new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
            //System.out.println(s1[i]);
            numbers[i] = Integer.parseInt(s1[i]);
        }
        Arrays.sort(numbers);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length; i++) {
            if (i!=s1.length){
                sb.append(numbers[i]).append(" ");
            }
            else
                sb.append(numbers[i]);
        }
        String fi = sb.toString();
        System.out.println(fi);


        //装箱
        Integer i = Integer.valueOf(100);

        //自动装箱
        Integer ii = 100;

        //拆箱
        ii = ii.intValue() + 200;  //先拆箱再装箱

        //
        ii += 200;
        System.out.println(ii);

        Date dd = new Date();
        System.out.println(dd);

        long time = 1000*60*60*24*365*30;
        dd = new Date(time);
        System.out.println(dd);
    }
}
