package com.mmall.concurrency.example.publicsh;

import com.mmall.concurrency.annoations.NotThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
@NotThreadSafe
public class UnsafePublish {

    private String[] state = {"a", "b", "c"};

    public String[] getState() {
        return state;
    }

    public static void main(String[] args) {
        UnsafePublish unsafePublish = new UnsafePublish();
        log.info("{}", Arrays.toString(unsafePublish.getState()));

        unsafePublish.getState()[0] = "b";
        log.info("{}", Arrays.toString(unsafePublish.getState()));
    }
}
