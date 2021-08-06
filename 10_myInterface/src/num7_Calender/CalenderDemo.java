package num7_Calender;
/*
*
* 日历类
*
* */
import java.util.Calendar;

public class CalenderDemo {
    public static void main(String[] args) {
        //获取对象
        Calendar c = Calendar.getInstance(); //多态性形式
        System.out.println(c);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int date = c.get(Calendar.DATE);

        System.out.println(year + "年" + month + "月" + date + "日");
    }
}
