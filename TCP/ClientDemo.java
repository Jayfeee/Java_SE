package company;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args)throws IOException {
        //创建发送端Socket对象
        Socket s = new Socket("111.16.224.113",12345);

        //通过Socket对象获取输出流
        OutputStream os = s.getOutputStream();

        //往输出流写入数据
        os.write("爱国、敬业、诚信、友善".getBytes());

        //释放资源
        s.close();
    }
}
