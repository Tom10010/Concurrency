package com.mmall.concurrency.example.immutable;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mmall.concurrency.annoations.ThreadSafe;


@ThreadSafe
public class ImmutableExample3 {

    private final static ImmutableList list = ImmutableList.of(1, 2, 3, 4);

    private final static ImmutableSet set = ImmutableSet.copyOf(list);

    private final static ImmutableMap map = ImmutableMap.of(1, 2, 3, 4);
    private final static ImmutableMap map2 = ImmutableMap.<Integer, Integer>builder().put(1, 2).put(3,4).build();

    public static void main(String[] args) {
        System.out.println(map.get(3));

        list.add(5);
        set.add(6);
        map.put(1, 3);
        map2.put(3, 4);

    }
}
