package num3_TCP.par1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);

        //获取输入流，读数据并且输出在控制台

        //监听客户端连接
        Socket s = ss.accept();

        //读数据
        //InputStream is = s.getInputStream();
        //服务器端口的接受必须和客户端的发送流的类型相同
        //BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()))
        /**byte[] bts = new byte[1024];
         int len = is.read(bts);
         String data = new String(bts, 0, len);**/
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println("来自客户端的消息：" + line);
            //给予反馈
            OutputStream os = s.getOutputStream();
            os.write("收到".getBytes());
        }
        ss.close();


    }
}
