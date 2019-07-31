package com.huang.hungry;

/**
 * Created by sccy on 2019/7/29/0029.
 */
public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton(){}
    public static Singleton getSingleton(){
        return singleton;
    }
}
