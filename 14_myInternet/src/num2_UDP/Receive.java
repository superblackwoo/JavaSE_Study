package num2_UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receive {
    public static void main(String[] args) throws IOException {
        //创建套接字对象
        DatagramSocket ds = new DatagramSocket(10086);

        //创建一个数据包用于接受数据
        byte[] bts = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bts, bts.length);

        //调用方法接受数据
        while (true) {
            ds.receive(dp);
            System.out.println("接收到的的数据为：" + new String(dp.getData(), 0, dp.getLength()));
        }


    }
}
