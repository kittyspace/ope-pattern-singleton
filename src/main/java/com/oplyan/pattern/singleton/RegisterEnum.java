package com.oplyan.pattern.singleton;

/**
 * @Discription: 注册式单例 序列化和反射都无法破坏单例
 * @Author: Created by lyan on 2019/9/11 9:48
 */
public enum  RegisterEnum {
    INSTANCE;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    private Object data;

    public static RegisterEnum getInstance(){
        return INSTANCE;
    }

}
