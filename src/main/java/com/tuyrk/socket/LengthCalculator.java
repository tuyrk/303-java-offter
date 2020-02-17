package com.tuyrk.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * User: 涂元坤
 * Mail: 766564616@qq.com
 * Create: 2019/3/13 20:12 星期三
 * Description:
 */
public class LengthCalculator extends Thread {
    //以socket为成员变量
    private Socket socket;

    public LengthCalculator(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //获取socket的输出流
            OutputStream outputStream = socket.getOutputStream();
            //获取socket的输入流
            InputStream inputStream = socket.getInputStream();
            int ch = 0;
            byte[] buff = new byte[1024];
            //buff主要用来读取输出的内容，存成byte数组，ch主要用来获取读取数组的长度
            ch = inputStream.read(buff);
            //将接收流的byte数组转成字符串，这里获取的内容是客户端发送过来的字符串参数
            String content = new String(buff, 0, ch);
            System.out.println("content = " + content);
            //网输出流里写入获取的字符串的长度，回发给客户端
            outputStream.write(String.valueOf(content.length()).getBytes());
            //不要忘记关闭输入输出流以及socket
            outputStream.close();
            inputStream.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
