package com.coding.dojo.args;

/**
 * @author admin
 */
interface  Argument {

    /**
     * 设置参数值
     * @param value
     * @throws ArgsException
     */
    void setValue(String... value) throws ArgsException;

    /**
     * 获取参数值
     * @return
     */
    Object getValue();
}
