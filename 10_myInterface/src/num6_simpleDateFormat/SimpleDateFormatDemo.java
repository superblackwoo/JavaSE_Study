package num6_simpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        //从Date到String
        SimpleDateFormat sdf = new SimpleDateFormat();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");
        String s = sdf.format(d);
        String s1 = sdf1.format(d);
        System.out.println(s);
        System.out.println(s1);

        //从String到Date
        String ss = "2021-08-06  14:03:36";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
        Date dd = sdf2.parse(ss);
        System.out.println(dd);
        System.out.println("----------");


        //测试工具类
        Date dd1 = new Date();
        String ss1 = "yyyy-MM-dd  HH:mm:ss";
        System.out.println(DateUtils.DateToString(dd1, ss1));

        String ss2 = "2021-08-06  14:03:36";
        System.out.println(DateUtils.StringToDate(ss2, ss1));
    }
}
