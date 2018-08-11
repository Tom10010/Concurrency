package com.mmall.concurrency.example.singleton;

import com.mmall.concurrency.annoations.*;

/**
 * 懒汉模式 ->双重同步锁单例模式
 * 单例在第一次执行的时候被创建。
 * 对 Example4 的改造
 */

@ThreadSafe
public class SingleTonExample5 {

    //私有构造方法
    private SingleTonExample5(){

    }

    //单例对象 volatile + 双重检测机制 -> 禁止指令重排
    private volatile static SingleTonExample5 instance = null;

    //静态工厂方法
    public static SingleTonExample5 getSingleTonExample(){
        if(instance == null){ // 双重检测机制
            synchronized (SingleTonExample5.class) { //同步锁
                    if(instance == null) {
                        instance = new SingleTonExample5();

                        //CPU分三步执行
                        //1、memory = allocate() 分配对象的内存空间
                        //2、ctorInstance() 初始化对象
                        //3、instance = memory 设置instance指向刚分配的内存

                        //用volatile限制的变量的初始化时不会发生指令重排。



                    }
            }
        }
        return instance;
    }

}
