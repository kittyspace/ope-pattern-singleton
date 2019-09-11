package com.oplyan.pattern.singleton;

import java.io.Serializable;

/**
 * @Discription: 反序列化时导致单例破坏。加上readResolve（）可避免
 * @Author: Created by lyan on 2019/8/24 10:51
 */
public class SeriableSingleton implements Serializable {
    //序列化就是说把内存中的状态通过转换成字节码的形式
    //从而转换一个IO 流，写入到其他地方(可以是磁盘、网络IO)
    //内存中状态给永久保存下来了
    //反序列化
    //将已经持久化的字节码内容，转换为IO 流
    //通过IO 流的读取，进而将读取的内容转换为Java 对象
    //在转换过程中会重新创建对象new

    public static final SeriableSingleton INSTANCE = new SeriableSingleton();

    private SeriableSingleton(){}

    public static SeriableSingleton getInstance(){
        return INSTANCE;
    }

    //为了解决序列化破坏单利，而加的
    private Object readResolve(){
        return INSTANCE;
    }

}
