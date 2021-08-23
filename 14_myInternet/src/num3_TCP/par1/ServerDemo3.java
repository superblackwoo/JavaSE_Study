package num3_TCP.par1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo3 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);

        while(true) {
            Socket s = ss.accept();
            new Thread(new SeverThread(s)).start();
        }
    }
}
