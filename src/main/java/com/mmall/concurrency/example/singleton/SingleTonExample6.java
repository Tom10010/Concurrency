package com.mmall.concurrency.example.singleton;

import com.mmall.concurrency.annoations.ThreadSafe;

/**
 * 饿汉模式
 * 单例在类加载的时候被创建。
 * 对 example2 的改造
 * 优点：线程安全
 * 缺点：可能引起性能下降
 *      可能造成资源的浪费
 */

@ThreadSafe
public class SingleTonExample6 {

    //私有构造方法
    private SingleTonExample6(){

    }

    //单例对象
    private  static SingleTonExample6 instance = null;

    static {
        instance = new SingleTonExample6();
    }

    //静态工厂方法
    public static SingleTonExample6 getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(getInstance().hashCode());
        System.out.println(getInstance().hashCode());

    }

}
