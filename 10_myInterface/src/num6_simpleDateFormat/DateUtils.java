package num6_simpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//工具类 构造方法私有  成员方法静态
public class DateUtils {
    private DateUtils() {
    }

    public static Date StringToDate(String s, String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date date = sdf.parse(s);
        return date;
    }

    public static String DateToString(Date d, String s) {
        SimpleDateFormat sdf = new SimpleDateFormat(s);
        String re = sdf.format(d);
        return re;
    }
}
