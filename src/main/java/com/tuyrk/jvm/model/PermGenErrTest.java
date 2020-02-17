package com.tuyrk.jvm.model;

        import java.util.Random;

/**
 * User: 涂元坤
 * Mail: 766564616@qq.com
 * Create: 2019/3/18 21:28 星期一
 * Description:
 */
/*
VM options：-XX:MaxPermSize=6M -XX:PermSize=6M
 */
public class PermGenErrTest {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            //将返回的随机字符串添加到字符串常量池中。
            getRandomString(1000000).intern();
        }
        System.out.println("Mission Complete");
    }

    //返回指定长度的随机字符串
    private static String getRandomString(int length) {
        //字符串源
        String str = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }
}
