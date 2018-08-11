package com.mmall.concurrency.example.singleton;

import com.mmall.concurrency.annoations.*;

/**
 * 懒汉模式
 * 单例在第一次执行的时候被创建。
 * 对 example1 改造使其变成线程安全的。
 */

@ThreadSafe
@NotRecommend
public class SingleTonExample3 {

    //私有构造方法
    private SingleTonExample3(){

    }

    //单例对象
    private  static SingleTonExample3 singleTonExample1 = null;

    //静态工厂方法
    //添加synchronize之后只允许一个线程访问，会带来性能的开销
    public static synchronized SingleTonExample3 getSingleTonExample(){
        if(singleTonExample1 == null){
            singleTonExample1 = new SingleTonExample3();
        }
        return singleTonExample1;
    }

}
