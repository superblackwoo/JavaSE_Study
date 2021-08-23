package num3_TCP.par1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器写入文本文件
 * **/
public class SeverDemo2 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);

        Socket s = ss.accept();

        //接收数据
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new FileWriter("14_myInternet\\www.txt"));

        String line;
        while((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
            OutputStream os = s.getOutputStream();
            os.write("收到".getBytes());
        }

        bw.close();
        ss.close();
    }
}
