package num3_TCP.par1;

import java.io.*;
import java.net.Socket;

public class SeverThread implements Runnable {
    private Socket s;

    public SeverThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("14_myInternet\\www.txt")));
            //解决名字冲突
            int count = 0;
            File f = new File("14_myInternet\\www["+ count +"].txt");
            while (f.exists()){
                count++;
                f = new File("14_myInternet\\www["+ count +"].txt");
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

            //反馈
            BufferedWriter bbw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bbw.write("（来自服务器）文件上传成功！");
            bbw.newLine();
            bbw.flush();

            //关闭资源
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
