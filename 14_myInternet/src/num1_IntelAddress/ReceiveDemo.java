package num1_IntelAddress;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.sql.SQLOutput;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //UDP接收数据
        //创建套接字对象
        DatagramSocket ds1 = new DatagramSocket(10086);
        DatagramSocket ds2 = new DatagramSocket(10087);

        //创建一个数据包用于接受数据
        byte[] bts = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bts,bts.length);

        //调用方法接受数据
        ds1.receive(dp);

        //解析数据
        byte[] bytes = dp.getData();
        int len = dp.getLength();
        String data = new String(bytes,0,len);
        System.out.println("ds1接受到的数据是：" + data);

        //优化
        ds2.receive(dp);
        System.out.println("ds2接受到的数据是："+ new String(dp.getData(),0,dp.getLength()));

        //关闭接收端
        ds1.close();
        ds2.close();
    }
}
