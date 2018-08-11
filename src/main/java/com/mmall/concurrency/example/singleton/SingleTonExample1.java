package com.mmall.concurrency.example.singleton;

import com.mmall.concurrency.annoations.NotThreadSafe;

/**
 * 懒汉模式
 * 单例在第一次执行的时候被创建。
 */

@NotThreadSafe
public class SingleTonExample1 {

    //私有构造方法
    private SingleTonExample1(){

    }

    //单例对象
    private  static SingleTonExample1 singleTonExample1 = null;

    //静态工厂方法
    public static SingleTonExample1 getSingleTonExample(){
        if(singleTonExample1 == null){
            singleTonExample1 = new SingleTonExample1();
        }
        return singleTonExample1;
    }

}
