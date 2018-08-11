package com.mmall.concurrency.example.immutable;


import com.google.common.collect.Maps;
import com.mmall.concurrency.annoations.NotThreadSafe;
import com.mmall.concurrency.annoations.ThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.Map;

/**
 * 用 collections 保护map的值不被修改。
 */

@Slf4j
@ThreadSafe
public class ImmutableExample2 {

    private static Map<Integer, Integer> map = Maps.newHashMap();

    static {
        map.put(1, 2);
        map.put(2, 3);
        map.put(3, 4);
        map.remove(1);
        map = Collections.unmodifiableMap(map);
        // 该map不能被final修饰
        //处理过后的map不能被修改。
    }

    public static void main(String[] args) {
        map.put(1, 3);
        //编译的时候没有问题，执行的时候会报错。
        log.info("{}", map.get(1));
    }


}
