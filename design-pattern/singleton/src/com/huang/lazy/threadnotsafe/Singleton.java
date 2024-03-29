package com.huang.lazy.threadnotsafe;

/**
 * Created by sccy on 2019/7/29/0029.
 */
public class Singleton {
    private static Singleton singleton = null;
    private Singleton(){}
    public static Singleton getSingleton(){
        if(singleton == null) singleton = new Singleton();
        return singleton;
    }
}
