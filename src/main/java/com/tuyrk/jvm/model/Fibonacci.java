package com.tuyrk.jvm.model;

/**
 * User: 涂元坤
 * Mail: 766564616@qq.com
 * Create: 2019/3/18 18:28 星期一
 * Description:
 */
public class Fibonacci {
    //F(0) = 0, F(1) = 1, 当n >= 2的时候, F(n) = F(n - 1) + F(n - 2),
    //F(2) = F(1) + F(0) = 1, F(3) = F(2) + F(1) = 1 + 1 = 2
    //F(0) - F(N)依次为 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
//        System.out.println(fibonacci(100000));
        stackLeakByThread();
    }

    public static void stackLeakByThread() {
        while (true) {
            new Thread() {
                public void run() {
                    while (true) {
                    }
                }
            }.start();
        }
    }
}
