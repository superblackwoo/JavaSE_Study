package num2_UDP;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Send {
    public static void main(String[] args) throws IOException {
        //创建Socket对象
        DatagramSocket ds = new DatagramSocket();
        String ss = "";
        byte[] bts = new byte[1024];


        while (!ss.equals("886")) {
            //输入数据
            System.out.println("请输入你想要发送的数据：");
            Scanner sc = new Scanner(System.in);
            ss = sc.nextLine();
            bts = ss.getBytes();

            //创建数据，并打包数据
            DatagramPacket dp = new DatagramPacket(bts, bts.length, InetAddress.getByName("DESKTOP-I5E05VM"), 10086);
            ds.send(dp);
        }

        ds.close();
    }
}
