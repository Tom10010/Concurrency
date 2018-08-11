package com.mmall.concurrency.example.singleton;

import com.mmall.concurrency.annoations.NotThreadSafe;

/**
 * 懒汉模式 ->双重同步锁单例模式
 * 单例在第一次执行的时候被创建。
 * 对 Example3 的改造
 */

@NotThreadSafe
public class SingleTonExample4 {

    //私有构造方法
    private SingleTonExample4(){

    }

    //单例对象
    private  static SingleTonExample4 instance = null;

    //静态工厂方法
    public static SingleTonExample4 getSingleTonExample(){
        if(instance == null){ // 双重检测机制      //B
            synchronized (SingleTonExample4.class) { //同步锁
                    if(instance == null) {
                        instance = new SingleTonExample4();  // A - 2

                        //CPU分三步执行
                        //1、memory = allocate() 分配对象的内存空间
                        //2、ctorInstance() 初始化对象
                        //3、instance = memory 设置instance指向刚分配的内存

                        ///单线程不会出问题。对于多线程可能会出现指令重排

                        //JVM和CPU优化之后的执行顺序
                        //1、memory = allocate() 分配对象的内存空间
                        //2、instance = memory 设置instance指向刚分配的内存
                        //3、ctorInstance() 初始化对象



                    }
            }
        }
        return instance;
    }

}
