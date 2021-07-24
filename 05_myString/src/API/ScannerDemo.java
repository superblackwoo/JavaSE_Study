package API;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符：");
        String line = sc.nextLine();
        System.out.println("你输入的数据是：" + line);
    }
}
