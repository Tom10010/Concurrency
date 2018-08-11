package com.mmall.concurrency.example.singleton;

import com.mmall.concurrency.annoations.Recommend;
import com.mmall.concurrency.annoations.ThreadSafe;


@ThreadSafe
@Recommend
public class SingleTonExample7 {
    private SingleTonExample7(){

    }

    public static SingleTonExample7 getInstance(){
        return Singleton.INSTANCE.getInstance();

    }

    private enum Singleton{
        INSTANCE;

        private SingleTonExample7 singleton;

        //JVM保证这个方法绝对只执行一次
        Singleton(){
            singleton = new SingleTonExample7();
        }

        public SingleTonExample7 getInstance(){
            return singleton;
        }
    }
}
