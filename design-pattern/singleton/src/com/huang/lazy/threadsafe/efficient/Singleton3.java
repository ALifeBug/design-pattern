package com.huang.lazy.threadsafe.efficient;

/**
 * Created by sccy on 2019/7/29/0029.
 */
public enum  Singleton3 {
    INSTANCE;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
