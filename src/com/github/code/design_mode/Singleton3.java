package com.github.code.design_mode;

/**
 * @Title: Singleton3
 * @Description: 饿汉式-线程安全
 * 但没有懒汉式延迟实例化带来的节约资源的好处：如果没有用到该类，就不会实例化
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/23 21:44
 */
public class Singleton3 {

    private static Singleton3 uniqueInstance = new Singleton3();

    private Singleton3() {}

    public static Singleton3 getUniqueInstance() {
        return uniqueInstance;
    }

    public static void main(String[] args) {
        thread3 t1 = new thread3();
        thread3 t2 = new thread3();
        thread3 t3 = new thread3();
        t1.start();
        t2.start();
        t3.start();
    }
}

class thread3 extends Thread {

    @Override
    public void run() {
        System.out.println(Singleton3.getUniqueInstance().hashCode());
    }
}
