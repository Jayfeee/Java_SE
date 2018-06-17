package company;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //创建socket(套接字)对象
        DatagramSocket ds = new DatagramSocket(10066);

        //创建用于接收数据的空数据包
        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys,bys.length);

        //接收数据包
        ds.receive(dp);

        //获取对方ip地址
        InetAddress address = dp.getAddress();
        String ip = address.getHostAddress();

        //解析数据包
        byte[] bys2 = dp.getData();
        String s = new String(bys2,0,bys2.length);
        System.out.println(ip+"--"+s);

        //释放资源
        ds.close();
    }
}
