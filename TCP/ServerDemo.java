package company;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建接收端服务器对象
        ServerSocket ss = new ServerSocket(12345);

        //监听客户端连接，返回一个Socket对象
        Socket s = ss.accept();  //阻塞式方法：侦听并接收到此套接字的连接,在连接传入之前一直阻塞

        //通过Socket对象获取输入流
        InputStream is = s.getInputStream();

        //解析输入流
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String str = new String(bys,0,len);

        InetAddress address = s.getInetAddress();
        String ip = address.getHostAddress();

        System.out.println(str+"--"+ip);
    }
}
