package num1_IntelAddress;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        //创建Socket对象
        DatagramSocket ds = new DatagramSocket();

        //创建数据，并打包数据
        //DatagramPacket(byte[] buf, int length, InetAddress address, int port)
        byte[] bts1 = "你好UDP！".getBytes();
        byte[] bts2 = "你好UDP ayo！".getBytes();
        int length = bts1.length;
        InetAddress address = InetAddress.getByName("DESKTOP-I5E05VM");
        int port = 10086;

        DatagramPacket dp1 = new DatagramPacket(bts1, length, address, port);
        DatagramPacket dp2 = new DatagramPacket(bts2, bts2.length, InetAddress.getByName("DESKTOP-I5E05VM"), 10087);

        //调用DatagramSoket对象方法 发送数据
        ds.send(dp1);
        ds.send(dp2);

        //关闭发送端
        ds.close();
    }
}
