package num7_Calender;
/*
*
* 日历类
*
* */
import java.util.Calendar;
import java.util.Scanner;

public class CalenderDemo {
    public static void main(String[] args) {
        //获取对象
        Calendar c = Calendar.getInstance(); //多态性形式
        System.out.println(c);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int date = c.get(Calendar.DATE);

        System.out.println(year + "年" + month + "月" + date + "日");
        eryuetian();
    }

    public static void eryuetian(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();

        Calendar c = Calendar.getInstance();
        c.set(year,2,1);

        //3月1日往前推一天
        c.add(Calendar.DATE, -1);

        int date = c.get(Calendar.DATE);

        System.out.println(date);
    }
}
