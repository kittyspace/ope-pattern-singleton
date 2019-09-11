package com.oplyan.pattern.singleton;

/**
 * @Discription: 该类经不能进行反射破坏。
 * 史上最牛B 的单例模式的实现方式 史上最牛B 的单例模式的实现方式 史上最牛B 的单例模式的实现方式
 * @Author: Created by lyan on 2019/8/24 10:33
 */
public class LazyInnerClassSingleton {

    //默认使用LazyInnerClassGeneral的时候，会先初始化内部类

    private LazyInnerClassSingleton(){
        if(LazyHolder.LAZY != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    //每一个关键字都不是多余的
    //static 是为了使单例的空间共享
    //保证这个方法不会被重写，重载
    public static final LazyInnerClassSingleton getInstance(){
        //在返回结果以前，一定会先加载内部类
        return LazyInnerClassSingleton.LazyHolder.LAZY;
    }
    //默认不加载
    private static class LazyHolder{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }

}
