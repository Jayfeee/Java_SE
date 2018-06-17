package company;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        //创建发送端socket(套接字)对象
        DatagramSocket ds = new DatagramSocket();

        //创建数据包
        byte[] bys = "爱国、敬业、诚信、友善".getBytes();
        InetAddress address = InetAddress.getByName("111.16.224.113");
        DatagramPacket dp = new DatagramPacket(bys,bys.length,address,10066);

        //发送数据
        ds.send(dp);

        //释放资源
        ds.close();
    }
}
