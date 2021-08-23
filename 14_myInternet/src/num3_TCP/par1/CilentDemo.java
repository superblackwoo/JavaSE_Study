package num3_TCP.par1;

import java.io.*;
import java.net.Socket;

public class CilentDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端的Socket对象
        Socket s = new Socket("DESKTOP-I5E05VM", 10000);

        //获取输出流写数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  //字符输入流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));  //字符输出流
        String line;
        while ((line = br.readLine()) != null) {
            if (line.equals("886")) {
                return ;
            }
            //获取输出流对象
//            OutputStream os = s.getOutputStream();
//            os.write(line.getBytes());
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

        //接受服务器反馈
        InputStream is = s.getInputStream();
        byte[] bts = new byte[1024];
        int len = is.read(bts);
        String data = new String(bts, 0, len);
        System.out.println("(来自服务器反馈：) 收到" + data);
        s.close();
    }
}
