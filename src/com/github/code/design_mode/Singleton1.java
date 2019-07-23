package com.github.code.design_mode;

/**
 * @Title: Singleton1
 * @Description: 懒汉式-线程不安全
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/23 21:22
 */

/**
 * 从具体实现角度来说，就是以下三点：
 * 一是单例模式的类只提供私有的构造函数
 * 二是类定义中含有一个该类的静态私有对象
 * 三是该类提供了一个静态的公有的函数用于创建或获取它本身的静态私有对象。
 */
public class Singleton1 {

    private static Singleton1 uniqueInstance;

    private Singleton1() {}

    public static Singleton1 getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton1();
        }
        return uniqueInstance;
    }

    public static void main(String[] args) {
        thread t1 = new thread();
        thread t2 = new thread();
        thread t3 = new thread();
        t1.start();
        t2.start();
        t3.start();
    }
}

class thread extends Thread {

    @Override
    public void run() {
        System.out.println(Singleton1.getUniqueInstance().hashCode());
    }
}
