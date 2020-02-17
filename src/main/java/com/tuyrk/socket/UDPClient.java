package com.tuyrk.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * User: 涂元坤
 * Mail: 766564616@qq.com
 * Create: 2019/3/13 20:50 星期三
 * Description:
 */
public class UDPClient {
    public static void main(String[] args) throws Exception {
        //客户端发送数据报给服务端
        DatagramSocket socket = new DatagramSocket();
        //要发送给服务端的数据
        byte[] buff = "hello world".getBytes();
        //将IP地址封装成InetAddress对象
        InetAddress address = InetAddress.getByName("127.0.0.1");
        //将要发送给服务端的数据封装成DatagramPacket对象 需要填写上IP地址和端口号
        DatagramPacket packet = new DatagramPacket(buff, buff.length, address, 65001);
        //发送数据给服务器
        socket.send(packet);

        //客户端接收服务器发送过来的数据报
        byte[] data = new byte[1024];
        //创建DatagramPacket对象用来存储服务期初发送火来的数据
        DatagramPacket receivedPacket = new DatagramPacket(data, data.length);
        //将要接收到的数据存储到DatagramPacket对象中
        socket.receive(receivedPacket);
        //将服务器端发送过来的数据取出来并打印到控制台
        String content = new String(receivedPacket.getData(), 0, receivedPacket.getLength());
        System.out.println("content = " + content);
    }
}
