package com.mmall.concurrency.example.singleton;

import com.mmall.concurrency.annoations.*;

/**
 * 饿汉模式
 * 单例在类加载的时候被创建。
 * 优点：线程安全
 * 缺点：可能引起性能下降
 *      可能造成资源的浪费
 */

@ThreadSafe
public class SingleTonExample2 {

    //私有构造方法
    private SingleTonExample2(){

    }

    //单例对象
    private  static SingleTonExample2 singleTonExample1 = new SingleTonExample2();

    //静态工厂方法
    public static SingleTonExample2 getSingleTonExample(){
        return singleTonExample1;
    }

}
