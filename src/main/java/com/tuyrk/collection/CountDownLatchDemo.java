package com.tuyrk.collection;

import java.util.concurrent.CountDownLatch;

/**
 * User: 涂元坤
 * Mail: 766564616@qq.com
 * Create: 2019/3/30 23:59 星期六
 * Description:
 * 闭锁CountDownLatch
 */
public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        new CountDownLatchDemo().go();
    }

    private void go() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        // 一次创建三个线程，并启动
        new Thread(new Task(countDownLatch), "Thread1").start();
        Thread.sleep(1000);
        new Thread(new Task(countDownLatch), "Thread2").start();
        Thread.sleep(1000);
        new Thread(new Task(countDownLatch), "Thread3").start();
        countDownLatch.await();
        System.out.println("所有线程已到达，主线程开始执行" + System.currentTimeMillis());
    }

    class Task implements Runnable {

        private CountDownLatch countDownLatch;

        public Task(CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run() {
            System.out.println("线程" + Thread.currentThread().getName() + "已经到达" + System.currentTimeMillis());
            countDownLatch.countDown();
        }
    }
}
