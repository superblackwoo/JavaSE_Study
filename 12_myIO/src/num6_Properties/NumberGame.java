package num6_Properties;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main() {
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        System.out.println(number);
        while (true) {
            System.out.println("请输入数字：");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            if (input == number) {
                System.out.println("猜对了！");
                break;
            } else if (input > number) {
                System.out.println("猜大了");
            } else {
                System.out.println("猜小了");
            }
        }
    }

}
