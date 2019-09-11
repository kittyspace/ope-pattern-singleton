package com.oplyan.pattern.singleton;

/**
 * @Discription: 恶汉单例：添加了readResolve（）以防止序列化破坏单例
 * @Author: Created by lyan on 2019/9/10 14:50
 */
public class Hungry {

    private static final Hungry singleton = new Hungry();

    private Hungry(){

    }

    public static Hungry getInstance(){
        return singleton;
    }

    //为了解决序列化破坏单利，而加的
    private Object readResolve(){
        return singleton;
    }

}
