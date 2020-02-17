package com.tuyrk.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * User: 涂元坤
 * Mail: 766564616@qq.com
 * Create: 2019/3/13 20:25 星期三
 * Description:
 */
public class TCPClient {
    public static void main(String[] args) throws Exception {
        //创建socket，并指定连接的是本机的端口号6500的服务器socket
        Socket socket = new Socket("127.0.0.1", 6500);
        //获取输出流
        OutputStream outputStream = socket.getOutputStream();
        //获取输入流
        InputStream inputStream = socket.getInputStream();
        //将要传递给server的字符串参数转换成byte数组，并将数组写入到输出流中
        outputStream.write("hello world".getBytes());
        int ch = 0;
        byte[] buff = new byte[1024];
        //buff主要与塞拉读取输入的内容，存成byte数组，ch主要用来获取数组的长度
        ch = inputStream.read(buff);
        String content = new String(buff, 0, ch);
        System.out.println("content = " + content);
        //不要忘记关闭输入输出流及socket
        outputStream.close();
        inputStream.close();
        socket.close();
    }
}
