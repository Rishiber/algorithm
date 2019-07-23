package com.github.code.design_mode;

/**
 * @Title: Singleton2
 * @Description: 懒汉式-线程安全
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/23 21:32
 */
// 双重校验锁
public class Singleton2 {

    // volatile防止多线程下指令重排序
    private static volatile Singleton2 uniqueInstance;

    private Singleton2() {}

    // 两次校验
    // 第一次校验：先判断uniqueInstance是否被实例化，如果没有被实例化才会对实例化语句加锁
    // 第二次校验：如果不校验，若两个线程进入第一个if判断中，即使上锁同步执行，uniqueInstance也会被实例化两次
    public static Singleton2 getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton2.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton2();
                }
            }
        }
        return uniqueInstance;
    }

    public static void main(String[] args) {
        thread2 t1 = new thread2();
        thread2 t2 = new thread2();
        thread2 t3 = new thread2();
        t1.start();
        t2.start();
        t3.start();
    }
}

class thread2 extends Thread {

    @Override
    public void run() {
        System.out.println(Singleton2.getUniqueInstance().hashCode());
    }
}
