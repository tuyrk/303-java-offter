package com.tuyrk.throwable;

/**
 * User: 涂元坤
 * Mail: 766564616@qq.com
 * Create: 2019/3/21 22:20 星期四
 * Description:
 */
public class ExceptionPerformance {
    public static void testException(String[] array) {
        try {
            System.out.println(array[0]);
        } catch (NullPointerException e) {
            System.out.println("array cannot be null");
        }
    }

    public static void testIf(String[] array) {
        if (array != null) {
            System.out.println(array[0]);
        } else {
            System.out.println("array cannot be null");
        }
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
//        testException(null);//1576333
        testIf(null);//299358
        System.out.println("cost " + (System.nanoTime() - start));
    }
}
