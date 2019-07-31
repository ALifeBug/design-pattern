package com.huang.lazy.threadsafe.efficient;

/**
 * Created by sccy on 2019/7/29/0029.
 */
public class Singleton2 {
    private static class Holder{
        private static Singleton2 singleton = new Singleton2();
    }
    private Singleton2(){}
    public static Singleton2 getSingleton(){
        return Holder.singleton;
    }
}
