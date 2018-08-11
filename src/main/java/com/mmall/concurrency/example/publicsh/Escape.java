package com.mmall.concurrency.example.publicsh;

import com.mmall.concurrency.annoations.NotRecommend;
import com.mmall.concurrency.annoations.NotThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
@NotThreadSafe
@NotRecommend
public class Escape {

    private static int thisIsCanBeEscape;

    public Escape(){
        new InerClass();
    }

    class InerClass{
        public InerClass(){
            log.info("{}", Escape.this.thisIsCanBeEscape);
        }
    }

    public static void main(String[] args) {
        new Escape();
    }
}
