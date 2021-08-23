package num1_IntelAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("DESKTOP-I5E05VM");
        String name = address.getHostName();
        String ad = address.getHostAddress();

        System.out.println("主机名称：" + name);
        System.out.println("ip:" + ad);
    }
}
