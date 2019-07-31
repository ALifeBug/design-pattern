package com.huang.lazy.threadsafe.nonefficient;

/**
 * Created by sccy on 2019/7/29/0029.
 */
public class Singleton {
    private static Singleton singleton = null;
    private Singleton(){}
    public static synchronized Singleton getSingleton(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
