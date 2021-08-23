package num3_TCP.par1;

import java.io.*;
import java.net.Socket;

/**
 * 客户端数据来源为文本文件
 **/
public class CilentDemo2 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("DESKTOP-I5E05VM", 10000);
        BufferedReader br = new BufferedReader(new FileReader("14_myInternet\\Demo.java"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        //读数据
        String line;
        while((line=br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
            //接受服务器反馈
            InputStream is = s.getInputStream();
            byte[] bts = new byte[1024];
            int len = is.read(bts);
            String data = new String(bts, 0, len);
            System.out.println("(来自服务器反馈：) " + data);
        }

        //释放资源
        br.close();
        s.close();
    }
}
