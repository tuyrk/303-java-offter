package com.tuyrk.socket;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * User: 涂元坤
 * Mail: 766564616@qq.com
 * Create: 2019/3/13 20:09 星期三
 * Description:
 */
public class TCPServer {
    public static void main(String[] args) throws Exception {
        //创建Socket，并将socket绑定到6500端口
        ServerSocket serverSocket = new ServerSocket(6500);
        //死循环，使得Socket一直等待并处理客户端发送过来的请求
        while (true) {
            //监听6500端口，知道客户端返回连接信息才返回
            Socket socket = serverSocket.accept();
            //获取客户端的请求信息后，执行相关业务逻辑
            new LengthCalculator(socket).start();
        }
    }
}
